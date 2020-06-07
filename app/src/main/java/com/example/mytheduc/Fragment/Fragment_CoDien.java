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

        coDienPlanetArrayList.add(new CoDienPlanet("1. CHỐNG ĐẨY",R.drawable.codien1,"Nằm áp xuống sàn lấy tay đở thân. Giữ thẳng thân trong khi nâng và hạ thân bằng tay. Bài tập này giúp tập ngực, vai, cơ tay sau, lưng và chân"));
        coDienPlanetArrayList.add(new CoDienPlanet("2. NGỒI DỰA TƯỜNG",R.drawable.codien2,"bắt đầu bằng việc dựa lưng vào tường, sau đó trượt xuống cho tới khi đầu gối vuông góc. dựa lương vào tường, để tay và cánh tay phía trên chân. Giữa tư thế. Baig tập này nhằm làm tăng các cơ bốn đầu đuồi."));
        coDienPlanetArrayList.add(new CoDienPlanet("3. ĐO SÀN",R.drawable.codien3,"nằm trên sàn, chạm sàn bằng ngón chân và cẳng tay. Giữ thẳng cơ thể và giữ cơ thể càng lâu càng tốt. Bài tập này làm khỏe cơ bụng, lưng và vai"));
        coDienPlanetArrayList.add(new CoDienPlanet("4. CHỐNG ĐẨY VÀ XOAY NGƯỜI",R.drawable.codien4,"Bắt đầu ở tư thế chống đẩy và khi nâng lên, xoay thân trên và giơ tay phải lên trên. Lặp lại bài tập này với tay kia. Đây là bài tập tuyệt vời cho ngực, vai, tay và phần trung tâm."));
        coDienPlanetArrayList.add(new CoDienPlanet("5. BƯỚC LÊN GHẾ", R.drawable.codien5,"Đứng trước ghế. Sau đó bước lên ghế rồi bước xuống. Bài tập này để tập khỏe chân và mông đùi."));
        coDienPlanetArrayList.add(new CoDienPlanet("6. TẬP CƠ BỤNG", R.drawable.codien6,"Nằm ngửa cong gối và tay duỗi thẳng. Sau đó nhấc thân lên khỏi sàn. Giữ một giây rồi từ từ trở lại tư thế ban đầu. Bài tập này chủ yếu cho các cơ bụng thẳng và cơ liên sườn."));
        coDienPlanetArrayList.add(new CoDienPlanet("7. TẬP CƠ TAY SAU GHẾ",R.drawable.codien7,"Từ vị trí bắt đầu, ngồi trên ghế. Rồi di chuyển mông khỏi ghế, tay giữ vào mép ghế. từ từ cong và duỗi thẳng tay để nang và hạ cơ thể. Bài tập này có tác dụng tốt cho cơ tay sau."));
        coDienPlanetArrayList.add(new CoDienPlanet("8. BƯỚC GẶP GỐI", R.drawable.codien8,"Đứng chân rộng bằng vai, tay để hông. Bước chân phải về trước và hạ thấp cơ thể cho tới khi đùi phải song song với sàn. trở lại tư thế và lặp lại với chân kia. Bài tập này giúp làm khỏe cơ bốn đầu đùi, cơ mông lớn và gân khỏe"));
}
}
