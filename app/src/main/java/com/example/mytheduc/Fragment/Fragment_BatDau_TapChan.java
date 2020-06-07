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

public class Fragment_BatDau_TapChan extends Fragment {
    private BatDauAdapter batDauAdapter;
    private ArrayList<BatDau_Model> listBaiTap = new ArrayList<>();
    ListView list;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_batdau_tapchan, container, false);

        list = (ListView) view.findViewById(R.id.listChan);
        setList(listBaiTap);
        batDauAdapter = new BatDauAdapter(listBaiTap);
        list.setAdapter(batDauAdapter);
        return view;
    }

    public void setList (ArrayList arr) {
        arr.add(new BatDau_Model("NÂNG BẮP CHÂN"));
        arr.add(new BatDau_Model("NẰM NGHIÊNG XOAY CHÂN"));
        arr.add(new BatDau_Model("CHÙNG CHÂN NGANG"));
        arr.add(new BatDau_Model("BƯỚC CHÙNG GỐI"));
        arr.add(new BatDau_Model("CHÙNG CHÂN CHÉO"));
        arr.add(new BatDau_Model("NÂNG BẤP CHÂN PHẢI Ở DƯỚI"));
        arr.add(new BatDau_Model("NÂNG BẤP CHÂN TRÁI Ở DƯỚI"));
        arr.add(new BatDau_Model("CHÙNG CHÂN SAU"));
    }

}
