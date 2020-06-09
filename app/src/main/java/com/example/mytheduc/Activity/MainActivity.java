package com.example.mytheduc.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.mytheduc.Adapter.BaiTapViewPagerAdapter;
import com.example.mytheduc.Fragment.Fragment_BaiTap;
import com.example.mytheduc.Fragment.Fragment_Lich;
import com.example.mytheduc.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements Fragment_Lich.OnFragmentInteractionListener{

    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();
        init();

    }

    private void init() {

        BaiTapViewPagerAdapter baiTapViewPagerAdapter = new BaiTapViewPagerAdapter(getSupportFragmentManager());
        baiTapViewPagerAdapter.adapterFragment(new Fragment_BaiTap(), "Bài Tập");
        baiTapViewPagerAdapter.adapterFragment(new Fragment_Lich(), "Lịch");
        viewPager.setAdapter(baiTapViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0);
        tabLayout.getTabAt(1);
    }

    private void anhxa() {

        tabLayout = findViewById(R.id.myTabLayout);
        viewPager = findViewById(R.id.myViewPager);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch (id){
            case R.id.action_HuongDan:
                Intent huongDan = new Intent(this, HuongDanActivity.class);
                startActivity(huongDan);
                return true;
            case R.id.action_CaiDat:
                Intent caiDat = new Intent(this, CaiDatActivity.class);
                startActivity(caiDat);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
