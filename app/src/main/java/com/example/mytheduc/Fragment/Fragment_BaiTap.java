package com.example.mytheduc.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytheduc.Adapter.CardAdapter;
import com.example.mytheduc.Model.Planet;
import com.example.mytheduc.R;

import java.util.ArrayList;

public class Fragment_BaiTap extends Fragment {

    View view;

    private RecyclerView recyclerView;
    //private CardAdapter adapter;
    private ArrayList<Planet> planetArrayList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_baitap, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        CardAdapter cardAdapter = new CardAdapter(getContext(), planetArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(cardAdapter);
        return view;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        planetArrayList = new ArrayList<>();
        planetArrayList.add(new Planet("CỔ ĐIỂN","Được khoa học chứng minh giúp giảm cân và nâng cao chức năng tim mạch.",R.drawable.hitdat));
        planetArrayList.add(new Planet("TẬP CƠ BỤNG","Có được cơ bắp lôi cuốn, bóng nhẵn và săn chắc bằng các phương pháp tập cơ bụng hiệu quả.", R.drawable.hitdat));
        planetArrayList.add(new Planet("TẬP CHÂN","Muốn có đôi chân thanh thoát và hấp dẫn? Duỗi thẳng và căng thân dưới ngay bây giờ!",R.drawable.hitdat));
        planetArrayList.add(new Planet("TẬP TAY","Dành vài phút mỗi ngày để có được cánh tay đẹp và săn chắc nhanh chóng.",R.drawable.hitdat));



    }


}
