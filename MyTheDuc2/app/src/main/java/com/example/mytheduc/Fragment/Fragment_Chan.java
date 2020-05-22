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

import com.example.mytheduc.Adapter.ChanAdapter;
import com.example.mytheduc.Model.ChanPlanet;
import com.example.mytheduc.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Fragment_Chan extends Fragment {
    private RecyclerView recyclerView;
    private ChanAdapter chanAdapter;
    private ArrayList<ChanPlanet> chanPlanetArrayList;
    private TabLayout tabLayout;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view;
        view = inflater.inflate(R.layout.fragment_chan, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.chanRecyclerView);
        ChanAdapter chanAdapter = new ChanAdapter(getContext(), chanPlanetArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1));
        recyclerView.setAdapter(chanAdapter);

        return view;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        chanPlanetArrayList = new ArrayList<>();

        chanPlanetArrayList.add(new ChanPlanet("1. NÂNG BẮP CHÂN", R.drawable.nangbapchan,"Đứng thẳng hai chân để gần nhau. Nhất ngot chân, đứng bằng các đầu ngón chân. Rồi hạ gót chân xuống. Lặp lại bài tập này từ 10-15 lần cho một lượt" ));
        chanPlanetArrayList.add(new ChanPlanet("2. NẰM NGHIÊNG XOAY CHÂN", R.drawable.xoaychan,"Nằm ngiêng bên trái, đầu kê vào tay trái. Sau đó nhắc chân phải và xoay vòng tròn bàn chân.lặp lại bài tập này 10-15 lần một lượt"));
        chanPlanetArrayList.add(new ChanPlanet("3. CHÙNG CHÂN NGANG", R.drawable.chungchanngang,"Đứng thẳng hai chân kề gần nhau. Đưa chân phải sang bên rồi hạ thấp thân xuống trong khi giũ thăng bằng chân trái. Trở lại tư thế bắt đầu và đổi bên. Lặp lại bài tập này từ 10-15 lần cho một lượt"));
        chanPlanetArrayList.add(new ChanPlanet("4. BƯỚC CHÙNG GỐI", R.drawable.buocchunggoi,"Đứng thẳng người. Sau đó chân trái bước ra sau và hạ người xuống. Khi đub=ngứ lên, nâng gối trái càng cao càng tốt. Trở lại tư thế bắt đầu. Lặp lại bài tập này tù 10-15 lần cho một lượt"));
    }
}
