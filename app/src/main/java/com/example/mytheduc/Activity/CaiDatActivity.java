package com.example.mytheduc.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.NumberPicker;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mytheduc.R;

public  class CaiDatActivity extends AppCompatActivity {

     Button nPRelay;
     TextView NumberRelay;

     Button npTime;
     TextView NumberTime;

     Button nPSafe;
     TextView NumberSafe;

     Button nPCountDown;
     TextView NumberCountDown;

    private Button btn_nhactap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cai_dat);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Cài đặt");


        nPRelay = (Button) findViewById(R.id.btn_DialogNumberPicker);
        NumberRelay = (TextView) findViewById(R.id.txt_Number);
        NumberRelay.setText("1 lần");
        nPRelay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPickerDialog();
            }
        });
        npTime = (Button) findViewById(R.id.btn_DialogTimePicker1);
        NumberTime = (TextView) findViewById(R.id.txt_Time1);
        NumberTime.setText("10 giây");
        npTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timePickerDialog1();
            }
        });
        nPSafe = (Button) findViewById(R.id.btn_DialogTimePicker2);
        NumberSafe = (TextView) findViewById(R.id.txt_Time2);
        NumberSafe.setText("5 giây");
        nPSafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timePickerDialog2();
            }
        });
        nPCountDown = (Button) findViewById(R.id.btn_DialogTimePicker3);
        NumberCountDown = (TextView) findViewById(R.id.txt_Time3);
        NumberCountDown.setText("10 giây");
        nPCountDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timePickerDialog3();
            }
        });

        
        btn_nhactap = (Button) findViewById(R.id.btn_NhacTapMoiNgay);
        btn_nhactap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNhacTapMoiNgay();
            }
        });
    }

    public void openNhacTapMoiNgay(){
        Intent intt_NhacTap = new Intent(this, NhacTapMoiNgay.class);
        startActivity(intt_NhacTap);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void numberPickerDialog() {
        NumberPicker myNumberPicker = new NumberPicker(this);
        myNumberPicker.setMaxValue(6);
        myNumberPicker.setMinValue(1);
        myNumberPicker.setWrapSelectorWheel(false);
        myNumberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal){
                NumberRelay.setText("" + newVal + " lần");
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this).setView(myNumberPicker);
        builder.setTitle("Đặt số lần (1 -> 6 lần)");
        builder.setPositiveButton("Đặt", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();

    }


    private void timePickerDialog1() {
        NumberPicker myNumberPicker = new NumberPicker(this);
        myNumberPicker.setMaxValue(60);
        myNumberPicker.setMinValue(10);
        myNumberPicker.setWrapSelectorWheel(false);
        NumberPicker.OnValueChangeListener myValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                NumberTime.setText("" + newVal + "  giây");
            }
        };
        myNumberPicker.setOnValueChangedListener(myValueChangeListener);
        AlertDialog.Builder builder = new AlertDialog.Builder(this).setView(myNumberPicker);
        builder.setTitle("Đặt thời lượng (10 -> 60 giây)");
        builder.setPositiveButton("Đặt", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();

    }

    private void timePickerDialog2() {
        NumberPicker myNumberPicker = new NumberPicker(this);
        myNumberPicker.setMaxValue(30);
        myNumberPicker.setMinValue(5);
        myNumberPicker.setWrapSelectorWheel(false);
        NumberPicker.OnValueChangeListener myValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                NumberSafe.setText("" + newVal + "  giây");
            }
        };
        myNumberPicker.setOnValueChangedListener(myValueChangeListener);
        AlertDialog.Builder builder = new AlertDialog.Builder(this).setView(myNumberPicker);
        builder.setTitle("Đặt thời lượng (5 -> 30 giây)");
        builder.setPositiveButton("Đặt", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();

    }

    public void timePickerDialog3() {
        NumberPicker myNumberPicker = new NumberPicker(this);
        myNumberPicker.setMaxValue(15);
        myNumberPicker.setMinValue(10);
        myNumberPicker.setWrapSelectorWheel(false);
        NumberPicker.OnValueChangeListener myValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                NumberCountDown.setText("" + newVal + "  giây");
            }
        };
        myNumberPicker.setOnValueChangedListener(myValueChangeListener);
        AlertDialog.Builder builder = new AlertDialog.Builder(this).setView(myNumberPicker);
        builder.setTitle("Đặt thời lượng (10 -> 15 giây)");
        builder.setPositiveButton("Đặt", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();

    }
}