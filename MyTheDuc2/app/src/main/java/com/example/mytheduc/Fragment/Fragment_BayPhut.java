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

import com.example.mytheduc.Adapter.BayPhutAdapter;
import com.example.mytheduc.Adapter.CardAdapter;
import com.example.mytheduc.Model.BayPhutPlanet;
import com.example.mytheduc.Model.Planet;
import com.example.mytheduc.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Fragment_BayPhut extends Fragment {
    View view;

    private RecyclerView recyclerView;
    private BayPhutAdapter bayPhutAdapter;
    private ArrayList<BayPhutPlanet> bayPhutPlanetArrayList;
    private TabLayout tabLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        view = inflater.inflate(R.layout.fragment_bayphut, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.bayPhutRecyclerView);

        BayPhutAdapter bayPhutAdapter = new BayPhutAdapter(getContext(), bayPhutPlanetArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1));
        recyclerView.setAdapter(bayPhutAdapter);

        return view;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        bayPhutPlanetArrayList = new ArrayList<>();
        bayPhutPlanetArrayList.add(new BayPhutPlanet("","   "));

        bayPhutPlanetArrayList.add(new BayPhutPlanet("7 PHÚT NGHĨA LÀ GÌ?","Bài tập 7 phút dựa trên HICT ( tập luyện cường độ cao) đã được chứng minh bằng cách an toàn, hiệu quả và hữu ích nhất để cải thiện cơ bắp và sức khỏe. Chỉ cần mất 7 phút để luyện tập."));
        bayPhutPlanetArrayList.add(new BayPhutPlanet("Lợi Ích:", "Bài tập 7 phút là cách mạng nhanh chống và tiện lợi để giảm cân và giảm mỡ bởi vì việc liên tục tập luyện bền bỉ giúp đốt cháy lượng mỡ đáng kể trong khi tập. HICT có thể là cách cực kì hữu hiệu và là phuong thức hiệu quả để tăng V.BO2 của cá nhân, giúp cải thiện sức khỏe tim mạch..."));
        bayPhutPlanetArrayList.add(new BayPhutPlanet("Thời Gian Cá Nhân:","30 giây là đủ cho mỗi bài tập 12-15 lần."));
        bayPhutPlanetArrayList.add(new BayPhutPlanet("Thời Gian Nghĩ Giữa Các Bài Tập:","Bạn nên nghĩ ngơi ngắn sau 30 giây tập cho phù hợp hơn. Do đó chúng tôi để 10 giây thời gian nghĩ mặc định. Việc này tạo cho bạn tổng thời gian tập là 7 phút."));
        bayPhutPlanetArrayList.add(new BayPhutPlanet("Tổng Thời Gian Tập:"," ACSM gợi ý bạn nên lặp lại toàn bộ vòng tập 2-3 lần (tổng số ít nhất là 20 phút)"));
    }
}
