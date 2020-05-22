package com.example.mytheduc.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytheduc.Model.TayPlanet;
import com.example.mytheduc.R;

import java.util.ArrayList;

public class TayAdapter  extends RecyclerView.Adapter<TayAdapter.PlanetHolder> {


    private Context context;
    private ArrayList<TayPlanet> tayPlanets;

    public TayAdapter(Context context, ArrayList<TayPlanet> tayPlanets) {
            this.context = context;
            this.tayPlanets = tayPlanets;
            }

    @NonNull
    @Override
    public TayAdapter.PlanetHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_tay, parent,false);
        return new PlanetHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TayAdapter.PlanetHolder holder, int position) {
        TayPlanet tayPlanet = tayPlanets.get(position);
        holder.setDetail(tayPlanet);

    }

    @Override
    public int getItemCount() {
        return tayPlanets.size();
    }

    public class PlanetHolder extends RecyclerView.ViewHolder {
        private TextView txt_NameTay;
        private ImageView imgTay;
        private TextView txt_huongDanTay;
        public PlanetHolder(@NonNull View itemView) {
            super(itemView);
            txt_NameTay = itemView.findViewById(R.id.txt_tayName);
            imgTay = itemView.findViewById(R.id.imgTay);
            txt_huongDanTay = itemView.findViewById(R.id.txt_huongDanTay);
        }

        public void setDetail(TayPlanet tayPlanet) {
            txt_NameTay.setText(tayPlanet.getNameTay());
            imgTay.setImageResource(tayPlanet.getImgTay());
            txt_huongDanTay.setText(tayPlanet.getHuongDanTay());
        }
    }
}
