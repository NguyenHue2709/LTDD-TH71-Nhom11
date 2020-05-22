package com.example.mytheduc.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytheduc.Model.BayPhutPlanet;
import com.example.mytheduc.Model.Planet;
import com.example.mytheduc.R;

import java.util.ArrayList;

public class BayPhutAdapter extends RecyclerView.Adapter<BayPhutAdapter.PlanetHolder> {

    private Context context;
    private ArrayList<BayPhutPlanet> bayPhutPlanets;
    public BayPhutAdapter (Context context, ArrayList<BayPhutPlanet> bayPhutPlanets){
        this.context = context;
        this.bayPhutPlanets = bayPhutPlanets;


    }
    @NonNull
    @Override
    public PlanetHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_bayphut, parent, false);
        return new PlanetHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetHolder holder, int position) {
        BayPhutPlanet bayPhutPlanet = bayPhutPlanets.get(position);
        holder.setDetails(bayPhutPlanet);

    }

    @Override
    public int getItemCount() {
        return bayPhutPlanets.size();
    }

    public class PlanetHolder extends RecyclerView.ViewHolder {
        private TextView txt_BayPhut;
        private TextView txt_DinhNghiaBayPhut;



        PlanetHolder(View itemView){
            super(itemView);
            txt_BayPhut = itemView.findViewById(R.id.txt_BayPhut);
            txt_DinhNghiaBayPhut = itemView.findViewById(R.id.txt_DinhNghia7Phut);

        }

        public void setDetails(BayPhutPlanet bayPhutPlanet) {
            txt_BayPhut.setText(bayPhutPlanet.getBayPhut());
            txt_DinhNghiaBayPhut.setText(bayPhutPlanet.getDinhNghiaBayPhut());
        }
    }
}
