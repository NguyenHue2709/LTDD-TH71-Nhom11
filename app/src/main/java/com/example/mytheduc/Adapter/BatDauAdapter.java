package com.example.mytheduc.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mytheduc.Model.BatDau_Model;
import com.example.mytheduc.R;

import java.util.ArrayList;

public class BatDauAdapter extends BaseAdapter {
    final ArrayList <BatDau_Model> list_batDau;

    public BatDauAdapter(ArrayList<BatDau_Model> list_batDau) {
        this.list_batDau = list_batDau;
    }

    @Override
    public int getCount() {
        return list_batDau.size();
    }

    @Override
    public Object getItem(int position) {
        return list_batDau.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewBatDau;
        if (convertView == null) {
            viewBatDau = View.inflate(parent.getContext(), R.layout.item_batdau, null);
        }
        else {
            viewBatDau = convertView;
        }
        BatDau_Model batdau = (BatDau_Model) getItem(position);
        ((TextView) viewBatDau.findViewById(R.id.txtBaiTap)).setText(batdau.tenBaiTap);
        ((TextView) viewBatDau.findViewById(R.id.txtGiay)).setText(batdau.giay);
        return viewBatDau;
    }
}
