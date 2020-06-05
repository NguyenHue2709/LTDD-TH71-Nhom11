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

import com.example.mytheduc.Adapter.TayAdapter;
import com.example.mytheduc.Model.TayPlanet;
import com.example.mytheduc.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Fragment_Tay extends Fragment {
    private RecyclerView recyclerView;
    private TayAdapter taydapter;
    private ArrayList<TayPlanet> tayPlanetArrayList;
    private TabLayout tabLayout;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view;
        view = inflater.inflate(R.layout.fragment_tay, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.tayRecyclerView);
        TayAdapter tayAdapter = new TayAdapter(getContext(), tayPlanetArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1));
        recyclerView.setAdapter(tayAdapter);

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        tayPlanetArrayList = new ArrayList<>();

        tayPlanetArrayList.add(new TayPlanet("1. XOAY TAY", R.drawable.xoaytay,"đứng trên sàn , hai tay dang thẳng sang hai bên cao bằng vai. Xoay tròn tay về trước, sau đó xoay về sau."));
        tayPlanetArrayList.add(new TayPlanet("2. TẬP CƠ TAY SAU GHẾ", R.drawable.cotaysaughe,"Từ vị trí bắt đầu, ngồi trên ghế. Rồi di chuyển mông khỏi ghế, tay giữ vào mép ghế. Từ từ cong và duỗi thẳng tay để nâng và hạ cơ thể. Bài tập này có tác dụng tốt cho cơ tay sau."));
        tayPlanetArrayList.add(new TayPlanet("3. CHỐNG ĐẨY TAY HÌNH KIM CƯƠNG", R.drawable.chongdaykimcuong,"Bắt đầu với tư thế quì gối chống hai tay, tay để phía dưới vai. Tạo hình kim cương bằng ngón tay trỏ và ngón cái với nhau, để ngay phía trước mặt, rồi chống đẩy lên và xuống. Nhớ phải giữ thẳng người."));
        tayPlanetArrayList.add(new TayPlanet("4. CHỐNG ĐẨY MỘT CHÂN", R.drawable.chongdaymotchan,"Bắt đầu ở tư thế chống đẩy cổ điển nhưng nhắc một chân lên. Sau đó thực hiện một vài động tác chống đẩy và chuyển sang bên kia. Động tác này tốt cho cơ bụng dưới của bạn."));
        tayPlanetArrayList.add(new TayPlanet("5. CHỐNG ĐẨY", R.drawable.chongday,"Nằm áp xuống sàn lấy tay đỡ thân. Giữ thân thẳng trong khi nâng và hạ thân bằng tay. Bài tập này giúp tay ngực, vai, cơ tay sau, lưng và chân"));
        tayPlanetArrayList.add(new TayPlanet("6. ĐẤM" ,R.drawable.dam,"Đứng chân rộng bằng vai, gối hơi cong. Cong khủy tay và đấm về phía trước mặt. Duỗi một tay về trước, lòng bàn tay quay xuống sàn. co tay lain và lặp lại với tay kia."));
        tayPlanetArrayList.add(new TayPlanet("7. PLANK LÊN VÀ XUỐNG", R.drawable.plank,"Bắt đầu với tư thế plank cánh tay thẳng, Sau đó gặp cánh tay phải và đặt cẳng tay trên mặt sàn cùng khủy tay dưới vai, sau đó gặp cánh tay trái và đi xuống tư thế plank truyền thống. Sau đó đảo lại và quay về vị trí bắt đầu. Lặp lại bài tập. Giữ thảng người trong suốt bài tập. Hít vào khi bạn đi xuống và thỏ ra khi đi lên. Đây là một bài tập tuyệt vời cho cơ đùi, cơ tay và cơ bụng."));
        tayPlanetArrayList.add(new TayPlanet("8. CĂNG VAI",R.drawable.cangvai,"Đặt một cánh tay ngang qua người, đặt song song với mặt đất sau đó dùng cánh tay kia kéo cánh tay song song về phía ngực. Giữ trong một lúc, chuyển cnhas tay và lặp lại bài tập. Giữ cánh tay bên trong thẳng trong x=suốt bài tập."));

    }
}
