package com.example.mytheduc.Adapter;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytheduc.Activity.HuongDanActivity;
import com.example.mytheduc.Fragment.Fragment_BaiTap;
import com.example.mytheduc.Fragment.Fragment_CoDien;
import com.example.mytheduc.Model.Planet;
import com.example.mytheduc.OnClickItem;
import com.example.mytheduc.R;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.PlanetHolder>{

    //private static final android.R.attr R = ;
    private Context context;
    private ArrayList<Planet> planets;

    //private Button btn;




    public CardAdapter (Context context, ArrayList<Planet> planets){
        this.context = context;
        this.planets = planets;


    }




    @NonNull
    @Override
    public PlanetHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_card, parent, false);
        return new PlanetHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetHolder holder, final int position) {

        Planet planet = planets.get(position);
        holder.btn_huongDan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent;

                int position = 1;
                Intent intent = new Intent(v.getContext(),HuongDanActivity.class);
                intent.putExtra("viewpager_position", 1);
                v.getContext().startActivity(intent);


            }
        });
        holder.setDetails(planet);



    }


    @Override
    public int getItemCount() {
        return planets.size();
    }

    public class PlanetHolder extends RecyclerView.ViewHolder {
        private TextView txt_Name;
        private TextView txt_dinhNghia;
        private ImageView img;
        private Button btn_huongDan;

        PlanetHolder(View itemView){
            super(itemView);
            txt_Name = itemView.findViewById(R.id.txt_Name);
            txt_dinhNghia = itemView.findViewById(R.id.txt_DinhNghia);
            img = itemView.findViewById(R.id.myImg);
            btn_huongDan = itemView.findViewById(R.id.btn_HuongDan);

        }

        public void setDetails(Planet planet) {
            txt_Name.setText(planet.getPlanetName());
            txt_dinhNghia.setText(planet.getDinhNghia());
            img.setImageResource(planet.getImg());

        }
    }
}
