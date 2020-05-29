package com.example.mytheduc.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mytheduc.R;

import java.util.ArrayList;

public class BatDauActivity extends Activity  {

    /*private ListView lvBatDau;
    private ArrayList <String> list;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batdau);
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
