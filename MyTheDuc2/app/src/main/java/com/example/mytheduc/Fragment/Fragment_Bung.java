package com.example.mytheduc.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytheduc.Adapter.BungAdapter;
import com.example.mytheduc.Model.BungPlanet;
import com.example.mytheduc.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Fragment_Bung extends Fragment {

    private RecyclerView recyclerView;
    private BungAdapter bungAdapter;
    private ArrayList<BungPlanet> bungPlanetArrayList;
    private TabLayout tabLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view;
        view = inflater.inflate(R.layout.fragment_bung, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.bungRecyclerView);
        BungAdapter bungAdapter = new BungAdapter(getContext(), bungPlanetArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1));
        recyclerView.setAdapter(bungAdapter);

        return view;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        bungPlanetArrayList = new ArrayList<>();

        bungPlanetArrayList.add(new BungPlanet("1. GÁNH TẠ NHẢY", R.drawable.ganhta,"Bắt đầu ở tư thế gánh tạ, ròi dùng cơ bụng bật nhảy lên để tạo sức mạnh. Bài tập này tập cho bụng." ));
        bungPlanetArrayList.add(new BungPlanet("2. GẶP BỤNG NGƯỢC", R.drawable.gapbungnguoc,"Nằm ngữa giữ đầu gối bạn vuông góc và tay để phía sau đầu. Nâng đùi và thân trên lên, sau đó duỗi căng ra. Lặp lại động tác này."));
        bungPlanetArrayList.add(new BungPlanet("3. GẶP BỤNG CHÉO", R.drawable.gapcheo,"Ngồi trên sàn với đầu gối cong, bàn chân đặt xuống mặt sàn và lựng nghiêng về sau. Sau đó nắm hai tay với nhau và xoay vặn từ bên này sang bên kia. Bài tập này tập cho cơ liên sườn"));
        bungPlanetArrayList.add(new BungPlanet("4. ĐO SÀN",R.drawable.dosan,"nằm trên sàn, chạm sàn bằng ngón chân và cẳng tay. Giữ thẳng cơ thể và giữ cơ thể càng lâu càng tốt. Bài tập này làm khỏe cơ bụng, lưng và vai"));
    }
}
