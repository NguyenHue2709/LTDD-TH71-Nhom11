package com.example.mytheduc.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.mytheduc.Adapter.BatDauAdapter;
import com.example.mytheduc.Adapter.CardAdapter;
import com.example.mytheduc.Fragment.Fragment_BatDau_CoDien;
import com.example.mytheduc.Fragment.Fragment_BatDau_TapChan;
import com.example.mytheduc.Fragment.Fragment_BatDau_TapCoBung;
import com.example.mytheduc.Fragment.Fragment_BatDau_TapTay;
import com.example.mytheduc.Model.BatDau_Model;
import com.example.mytheduc.Model.Planet;
import com.example.mytheduc.R;

import java.util.ArrayList;
import java.util.Collections;


public class BatDauActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private ArrayList<BatDau_Model> listBaiTap = new ArrayList<>();
    private Switch sw;
    private Button btn_Di;
    BatDauAdapter batDauAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batdau);
        progressBar = (ProgressBar) findViewById(R.id.progress_circular);
        btn_Di = (Button) findViewById(R.id.btnDi);
        btn_Di.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BatDauActivity.this, SanSangActivity.class);
                startActivity(intent);
            }
        });
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        String id = CardAdapter.ten;
        switch (id) {
            case "CỔ ĐIỂN": {
                Fragment_BatDau_CoDien fragment_batDau_coDien = new Fragment_BatDau_CoDien();
                fragment_batDau_coDien.setList(listBaiTap);
                fragmentTransaction.add(R.id.fragBatDau, fragment_batDau_coDien);
                fragmentTransaction.commit();
                break;
            }
            case "TẬP CƠ BỤNG":{
                Fragment_BatDau_TapCoBung fragment_batDau_tapCoBung = new Fragment_BatDau_TapCoBung();
                fragment_batDau_tapCoBung.setList(listBaiTap);
                fragmentTransaction.add(R.id.fragBatDau, fragment_batDau_tapCoBung);
                fragmentTransaction.commit();
                break;
            }
            case "TẬP CHÂN": {
                Fragment_BatDau_TapChan fragment_batDau_tapChan = new Fragment_BatDau_TapChan();
                fragment_batDau_tapChan.setList(listBaiTap);
                fragmentTransaction.add(R.id.fragBatDau, fragment_batDau_tapChan);
                fragmentTransaction.commit();
                break;
            }
            case "TẬP TAY": {
                Fragment_BatDau_TapTay fragment_batDau_tapTay= new Fragment_BatDau_TapTay();
                fragment_batDau_tapTay.setList(listBaiTap);
                fragmentTransaction.add(R.id.fragBatDau, fragment_batDau_tapTay);
                fragmentTransaction.commit();
                break;
            }
        }

    }
}
