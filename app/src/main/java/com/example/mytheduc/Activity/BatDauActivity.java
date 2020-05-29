package com.example.mytheduc.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mytheduc.R;

import java.util.ArrayList;

public class BatDauActivity extends Activity  {

    /*private ListView lvBatDau;
    private ArrayList <String> list;*/
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
