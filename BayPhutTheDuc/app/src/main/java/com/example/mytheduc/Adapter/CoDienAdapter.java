package com.example.mytheduc.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytheduc.Model.CoDienPlanet;
import com.example.mytheduc.R;

import java.util.ArrayList;

public class CoDienAdapter extends RecyclerView.Adapter<CoDienAdapter.PlanetHolder> {

    private Context context;
    private ArrayList<CoDienPlanet> coDienPlanets;

    public CoDienAdapter(Context context, ArrayList<CoDienPlanet> coDienPlanets) {
        this.context = context;
        this.coDienPlanets = coDienPlanets;
    }

    @NonNull
    @Override
    public PlanetHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_codien, parent, false);
        return new PlanetHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CoDienAdapter.PlanetHolder holder, int position) {
        CoDienPlanet coDienPlanet = coDienPlanets.get(position);
        holder.setDetail(coDienPlanet);

    }

    @Override
    public int getItemCount() {
        return coDienPlanets.size();
    }

    public class PlanetHolder extends RecyclerView.ViewHolder {
        private TextView txt_NameCoDien;
        private ImageView imgCoDien;
        private TextView txt_huongDanCoDien;
        public PlanetHolder(@NonNull View itemView) {
            super(itemView);
            txt_NameCoDien = itemView.findViewById(R.id.txt_coDienName);
            imgCoDien = itemView.findViewById(R.id.imgCoDien);
            txt_huongDanCoDien = itemView.findViewById(R.id.txt_huongDanCoDien);
        }

        public void setDetail(CoDienPlanet coDienPlanet) {
            txt_NameCoDien.setText(coDienPlanet.getNameCoDien());
            imgCoDien.setImageResource(coDienPlanet.getImgCoDien());
            txt_huongDanCoDien.setText(coDienPlanet.getHuongDanCoDien());
        }
    }
}
