package com.example.mytheduc.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytheduc.Model.ChanPlanet;
import com.example.mytheduc.R;

import java.util.ArrayList;

public class ChanAdapter extends RecyclerView.Adapter<ChanAdapter.PlanetHolder> {


    private Context context;
    private ArrayList<ChanPlanet> chanPlanets;

    public ChanAdapter(Context context, ArrayList<ChanPlanet> chanPlanets) {
        this.context = context;
        this.chanPlanets = chanPlanets;
    }

    @NonNull
    @Override
    public ChanAdapter.PlanetHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_chan, parent,false);
        return new PlanetHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChanAdapter.PlanetHolder holder, int position) {
        ChanPlanet chanPlanet = chanPlanets.get(position);
        holder.setDetail(chanPlanet);

    }

    @Override
    public int getItemCount() {
        return chanPlanets.size();
    }

    public class PlanetHolder extends RecyclerView.ViewHolder {
        private TextView txt_NameChan;
        private ImageView imgChan;
        private TextView txt_huongDanChan;
        public PlanetHolder(@NonNull View itemView) {
            super(itemView);
            txt_NameChan = itemView.findViewById(R.id.txt_chanName);
            imgChan = itemView.findViewById(R.id.imgChan);
            txt_huongDanChan = itemView.findViewById(R.id.txt_huongDanChan);
        }

        public void setDetail(ChanPlanet chanPlanet) {
            txt_NameChan.setText(chanPlanet.getNameChan());
            imgChan.setImageResource(chanPlanet.getImgChan());
            txt_huongDanChan.setText(chanPlanet.getHuongDanChan());
        }
    }
}
