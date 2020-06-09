package com.example.mytheduc.Activity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mytheduc.R;

import java.util.Calendar;

public class LichActivity extends AppCompatActivity{
    //Khai bao dialog daypicker
    private static final String TAG = "LichActivity";

    TextView tvPickDate;
    DatePickerDialog.OnDateSetListener setListener;

    //-------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_lich);

        //Activity cua dialog daypicker
        tvPickDate = findViewById(R.id.tvPickDate);

        tvPickDate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        LichActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        setListener,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        setListener = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                month = month + 1;
                Log.d(TAG, "onDateSet: mm/yyy" + month + "/" + year);
                String date = month + " Thg " + year;
                tvPickDate.setText(date);
            }
        };

        //------------------------

    }
}
