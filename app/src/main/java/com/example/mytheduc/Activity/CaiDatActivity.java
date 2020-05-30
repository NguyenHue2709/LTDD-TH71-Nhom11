package com.example.mytheduc.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

import com.example.mytheduc.R;

public class CaiDatActivity extends AppCompatActivity {

    private Button numberPicker;
    private TextView Number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cai_dat);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Cài đặt");

        numberPicker = (Button) findViewById(R.id.btn_DialogNumberPicker);
        Number = (TextView) findViewById(R.id.txt_Number);
        numberPicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPickerDialog();
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void numberPickerDialog(){
        NumberPicker myNumberPicker = new NumberPicker(this);
        myNumberPicker.setMaxValue(4);
        myNumberPicker.setMinValue(1);
        NumberPicker.OnValueChangeListener myValueChangeListener = new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                Number.setText(""+newVal+"  Lần");
            }
        };
        myNumberPicker.setOnValueChangedListener(myValueChangeListener);

        AlertDialog.Builder builder = new AlertDialog.Builder(this).setView(myNumberPicker);
        builder.setTitle("Đặt lại vòng lặp");
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.show();

    }

}
