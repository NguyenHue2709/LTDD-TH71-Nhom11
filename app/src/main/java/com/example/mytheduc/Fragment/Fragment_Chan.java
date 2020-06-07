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

        chanPlanetArrayList.add(new ChanPlanet("1. NÂNG BẮP CHÂN", R.drawable.chan1,"Đứng thẳng hai chân để gần nhau. Nhất ngot chân, đứng bằng các đầu ngón chân. Rồi hạ gót chân xuống. Lặp lại bài tập này từ 10-15 lần cho một lượt" ));
        chanPlanetArrayList.add(new ChanPlanet("2. NẰM NGHIÊNG XOAY CHÂN", R.drawable.chan2,"Nằm ngiêng bên trái, đầu kê vào tay trái. Sau đó nhắc chân phải và xoay vòng tròn bàn chân.lặp lại bài tập này 10-15 lần một lượt"));
        chanPlanetArrayList.add(new ChanPlanet("3. CHÙNG CHÂN NGANG", R.drawable.chan3,"Đứng thẳng hai chân kề gần nhau. Đưa chân phải sang bên rồi hạ thấp thân xuống trong khi giũ thăng bằng chân trái. Trở lại tư thế bắt đầu và đổi bên. Lặp lại bài tập này từ 10-15 lần cho một lượt"));
        chanPlanetArrayList.add(new ChanPlanet("4. BƯỚC CHÙNG GỐI", R.drawable.chan4,"Đứng thẳng người. Sau đó chân trái bước ra sau và hạ người xuống. Khi đub=ngứ lên, nâng gối trái càng cao càng tốt. Trở lại tư thế bắt đầu. Lặp lại bài tập này tù 10-15 lần cho một lượt"));
        chanPlanetArrayList.add(new ChanPlanet("5 CHÙNG CHÂN CHÉO",R.drawable.chan5,"Dứng thẳng. Rồi lùi ra sau với chân trái để sang phải, đồng thời cong gối. Trở lại tư thế bắt đầu và đổi bên. Lặp lại bài tập này từ 10-15 lần cho một lượt."));
        chanPlanetArrayList.add(new ChanPlanet("6. NÂNG BĂP CHÂN PHẢI Ở DƯỚI", R.drawable.chan6,"nằm nghiêng bên phải, đầu tựa vào tay phải. Sau đó để chân trái thẳng trên sàn. Nhấn chân phải lên rồi hạ xuống. lặp lại bài tập này từ 10-15 lần cho một lượt"));
        chanPlanetArrayList.add(new ChanPlanet("7. NÂNG BẮP CHÂN TRÁI Ở DƯỚI" ,R.drawable.chan7,"Nằm nghiêng bên trái, đầu tựa vào tay phải. Sau đó để chân trái thẳng trên sàn. Nhấc chân phải lên rồi hạ xuống. lặp lại bài tậ này từ 10-15 lần cho một lượt."));
        chanPlanetArrayList.add(new ChanPlanet("8. CHÙNG CHÂN RA SAU ĐA CHÂN TRÁI LÊN TRƯỚC",R.drawable.chan8,"Đứng thảng người. chân trái bước ra sau và hạ thân người xuống. Khi đứng lên, đá chân trái lên trên. Trở lại tư thế bắt đầu và lặp lại bài tập này từ 10-15 lần cho một lượt "));
    }
}
