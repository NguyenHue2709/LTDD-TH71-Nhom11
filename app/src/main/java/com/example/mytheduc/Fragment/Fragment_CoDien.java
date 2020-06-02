package com.example.mytheduc.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytheduc.Adapter.CoDienAdapter;
import com.example.mytheduc.Model.CoDienPlanet;
import com.example.mytheduc.OnClickItem;
import com.example.mytheduc.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Fragment_CoDien extends Fragment {
    private RecyclerView recyclerView;
    private CoDienAdapter coDienAdapter;
    private ArrayList<CoDienPlanet> coDienPlanetArrayList;
    private TabLayout tabLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view;
        view = inflater.inflate(R.layout.fragment_codien, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.coDienRecyclerView);
        CoDienAdapter coDienAdapter = new CoDienAdapter(getContext(), coDienPlanetArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1));
        recyclerView.setAdapter(coDienAdapter);

        return view;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        coDienPlanetArrayList = new ArrayList<>();

        coDienPlanetArrayList.add(new CoDienPlanet("1. CHỐNG ĐẨY",R.drawable.chongday,"Nằm áp xuống sàn lấy tay đở thân. Giữ thẳng thân trong khi nâng và hạ thân bằng tay. Bài tập này giúp tập ngực, vai, cơ tay sau, lưng và chân"));
        coDienPlanetArrayList.add(new CoDienPlanet("2. NGỒI DỰA TƯỜNG",R.drawable.duatuong,"bắt đầu bằng việc dựa lưng vào tường, sau đó trượt xuống cho tới khi đầu gối vuông góc. dựa lương vào tường, để tay và cánh tay phía trên chân. Giữa tư thế. Baig tập này nhằm làm tăng các cơ bốn đầu đuồi."));
        coDienPlanetArrayList.add(new CoDienPlanet("3. ĐO SÀN",R.drawable.dosan,"nằm trên sàn, chạm sàn bằng ngón chân và cẳng tay. Giữ thẳng cơ thể và giữ cơ thể càng lâu càng tốt. Bài tập này làm khỏe cơ bụng, lưng và vai"));
        coDienPlanetArrayList.add(new CoDienPlanet("4. CHỐNG ĐẨY VÀ XOAY NGƯỜI",R.drawable.xoaynguoi,"Bắt đầu ở tư thế chống đẩy và khi nâng lên, xoay thân trên và giơ tay phải lên trên. Lặp lại bài tập này với tay kia. Đây là bài tập tuyệt vời cho ngực, vai, tay và phần trung tâm."));
}
}
