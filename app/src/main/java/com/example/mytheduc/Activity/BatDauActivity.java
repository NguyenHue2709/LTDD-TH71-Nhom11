package com.example.mytheduc.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import com.example.mytheduc.Adapter.BatDauAdapter;
import com.example.mytheduc.Model.BatDau_Model;
import com.example.mytheduc.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BatDauActivity extends Activity  {

    ArrayList<BatDau_Model> listBaiTap;
    BatDauAdapter bd;
    ListView list;
    Switch sw;

    private Button btn_Di;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batdau);
        btn_Di = (Button) findViewById(R.id.btnDi);
        btn_Di.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BatDauActivity.this, SanSangActivity.class);
                startActivity(intent);
            }
        });
        listBaiTap = new ArrayList<>();
        listBaiTap.add(new BatDau_Model("Bài 1"));
        listBaiTap.add(new BatDau_Model("Bài 2"));
        listBaiTap.add(new BatDau_Model("Bài 3"));
        listBaiTap.add(new BatDau_Model("Bài 4"));
        listBaiTap.add(new BatDau_Model("Bài 5"));
        listBaiTap.add(new BatDau_Model("Bài 6"));
        bd = new BatDauAdapter(listBaiTap);

        list = findViewById(R.id.listBaiTap);
        list.setAdapter(bd);

        sw = (Switch) findViewById(R.id.switchNgauNhien);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Collections.shuffle(listBaiTap);
                list = findViewById(R.id.listBaiTap);
                list.setAdapter(bd);
            }
        });
    }

        /*lvBatDau = (ListView) findViewById(R.id.listBaiTap);
        list = new ArrayList<String>();
        list.add("Bài 1");
        list.add("Bài 2");
        list.add("Bài 3");
        list.add("Bài 4");
        list.add("Bài 5");implements AdapterView.OnItemClickListener

        ArrayAdapter <String> BatDauViewAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, list);
        lvBatDau.setAdapter(BatDauViewAdapter);
        lvBatDau.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, list.get(position),Toast.LENGTH_SHORT).show();
    }*/
}
