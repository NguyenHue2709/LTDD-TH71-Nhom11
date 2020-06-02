package com.example.mytheduc.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mytheduc.Adapter.BatDauAdapter;
import com.example.mytheduc.Model.BatDau_Model;
import com.example.mytheduc.R;

import java.util.ArrayList;

public class Fragment_BatDau_TapCoBung extends Fragment {
    private BatDauAdapter batDauAdapter;
    private ArrayList<BatDau_Model> listBaiTap = new ArrayList<>();
    ListView list;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_batdau_tapcobung, container, false);

        list = (ListView) view.findViewById(R.id.listBung);
        setList(listBaiTap);
        batDauAdapter = new BatDauAdapter(listBaiTap);
        list.setAdapter(batDauAdapter);
        return view;
    }

    public void setList (ArrayList arr) {
        arr.add(new BatDau_Model("GÁNH TẠ NHẢY"));
        arr.add(new BatDau_Model("GẬP BỤNG NGƯỢC"));
        arr.add(new BatDau_Model("TẤM VÁN THẲNG TAY"));
        arr.add(new BatDau_Model("GIẢM MỠ TOÀN THÂN"));
        arr.add(new BatDau_Model("NÂNG TAY DÀI"));
        arr.add(new BatDau_Model("CẦU MỘT CHÂN"));
        arr.add(new BatDau_Model("CHỐNG ĐỠ MỘT CHÂN"));
        arr.add(new BatDau_Model("ĐO SÀN"));
        arr.add(new BatDau_Model("GẬP BỤNG NGANG CHÂN"));
        arr.add(new BatDau_Model("GẬP BỤNG ĐẠP XE"));
    }

}
