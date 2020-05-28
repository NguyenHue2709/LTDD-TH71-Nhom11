package com.example.mytheduc.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import com.example.mytheduc.Adapter.BaiTapViewPagerAdapter;
import com.example.mytheduc.Fragment.Fragment_BaiTap;
import com.example.mytheduc.Fragment.Fragment_BayPhut;
import com.example.mytheduc.Fragment.Fragment_Bung;
import com.example.mytheduc.Fragment.Fragment_Chan;
import com.example.mytheduc.Fragment.Fragment_CoDien;
import com.example.mytheduc.Fragment.Fragment_Lich;
import com.example.mytheduc.Fragment.Fragment_Tay;
import com.example.mytheduc.OnClickItem;
import com.example.mytheduc.R;
import com.google.android.material.tabs.TabLayout;

public class HuongDanActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huong_dan);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("HƯỚNG DẪN");

        anhxa();
        init();

    }

    private void init() {
        BaiTapViewPagerAdapter baiTapViewPagerAdapter = new BaiTapViewPagerAdapter(getSupportFragmentManager());
        baiTapViewPagerAdapter.adapterFragment(new Fragment_BayPhut(), "7 PHÚT");
        baiTapViewPagerAdapter.adapterFragment(new Fragment_CoDien(), "CỔ ĐIỂN");
        baiTapViewPagerAdapter.adapterFragment(new Fragment_Bung(), "Bụng");
        baiTapViewPagerAdapter.adapterFragment(new Fragment_Chan(), "CHÂN");
        baiTapViewPagerAdapter.adapterFragment(new Fragment_Tay(), "TAY");
        viewPager.setAdapter(baiTapViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0);
        tabLayout.getTabAt(1);
        tabLayout.getTabAt(2);
        tabLayout.getTabAt(3);
        tabLayout.getTabAt(4);
    }

    private void anhxa() {
        tabLayout = findViewById(R.id.huongDanTabLayout);
        viewPager = findViewById(R.id.huongDanViewPager);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
