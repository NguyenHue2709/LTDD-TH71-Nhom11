package com.example.mytheduc.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.mytheduc.Fragment.Fragment_TimePickerNhacNho;
import com.example.mytheduc.R;

public class NhacTapMoiNgay extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cai_dat);

        Button btn_Nhacnho = (Button) findViewById(R.id.btn_NhacTapThoiGian);
        btn_Nhacnho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment timepickerNhacNho = new Fragment_TimePickerNhacNho();
                timepickerNhacNho.show(getSupportFragmentManager(), "time picker");
            }
        });
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        TextView txtv = (TextView) findViewById(R.id.txtNhacTapThoiGian);
        txtv.setText(hourOfDay + ":" + minute);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
