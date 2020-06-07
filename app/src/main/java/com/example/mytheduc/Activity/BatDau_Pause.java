package com.example.mytheduc.Activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mytheduc.R;

public class BatDau_Pause extends AppCompatActivity {
    private ImageView ibtn_pause;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_pause);
        ibtn_pause = findViewById(R.id.ibtn_pause);
        ibtn_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BatDau_Pause.this, SanSangActivity.class);
                startActivity(intent);
            }
        });

    }
}
