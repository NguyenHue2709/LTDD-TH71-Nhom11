package com.example.mytheduc.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytheduc.Model.BungPlanet;
import com.example.mytheduc.Model.CoDienPlanet;
import com.example.mytheduc.R;

import java.util.ArrayList;

public class BungAdapter extends RecyclerView.Adapter<BungAdapter.PlanetHolder> {


    private Context context;
    private ArrayList<BungPlanet> bungPlanets;

    public BungAdapter(Context context, ArrayList<BungPlanet> bungPlanets) {
        this.context = context;
        this.bungPlanets = bungPlanets;
    }

    @NonNull
    @Override
    public BungAdapter.PlanetHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.item_bung, parent, false);
        return new PlanetHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BungAdapter.PlanetHolder holder, int position) {
        BungPlanet bungPlanet = bungPlanets.get(position);
        holder.setDetail(bungPlanet);

    }

    @Override
    public int getItemCount() {
        return bungPlanets.size();
    }

    public class PlanetHolder extends RecyclerView.ViewHolder {
        private TextView txt_NameBung;
        private ImageView imgBung;
        private TextView txt_huongDanBung;
        public PlanetHolder(@NonNull View itemView) {
            super(itemView);
            txt_NameBung = itemView.findViewById(R.id.txt_bungName);
            imgBung = itemView.findViewById(R.id.imgBung);
            txt_huongDanBung = itemView.findViewById(R.id.txt_huongDanBung);
        }

        public void setDetail(BungPlanet bungPlanet) {
            txt_NameBung.setText(bungPlanet.getNameBung());
            imgBung.setImageResource(bungPlanet.getImgBung());
            txt_huongDanBung.setText(bungPlanet.getHuongDanBung());
        }
    }
}