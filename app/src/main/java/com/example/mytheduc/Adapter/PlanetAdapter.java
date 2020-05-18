package com.example.mytheduc.Adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytheduc.Model.Planet;
import com.example.mytheduc.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.PlanetHolder> {

    private Context context;
    private ArrayList<Planet> planets;

    public PlanetAdapter(Context context, ArrayList<Planet> planets) {
        this.context = context;
        this.planets = planets;
    }

    @NonNull
    @Override
    public PlanetHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_planet, parent, false);
        return new PlanetHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetHolder holder, int position) {
        Planet planet = planets.get(position);
        holder.setDetails(planet);

    }

    @Override
    public int getItemCount() {
        return planets.size();
    }

    public class PlanetHolder extends RecyclerView.ViewHolder {
        private TextView txt_Name;
        private TextView txt_dinhNghia;

        PlanetHolder(View itemView){

            super(itemView);
            txt_Name = itemView.findViewById(R.id.txt_Name);
            txt_dinhNghia = itemView.findViewById(R.id.txt_DinhNghia);
        }

        public void setDetails(Planet planet) {
            txt_Name.setText(planet.getPlanetName());
            txt_dinhNghia.setText(planet.getDinhNghia());
        }
    }
}
