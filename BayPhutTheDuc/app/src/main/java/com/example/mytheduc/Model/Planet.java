package com.example.mytheduc.Model;

public class Planet {
    private String planetName;
    private String dinhNghia;
    private int img;

    public Planet(String planetName, String dinhNghia, int img){
        this.planetName = planetName;
        this.dinhNghia = dinhNghia;
        this.img = img;
    }

    public String getPlanetName(){return planetName;}
    public void setPlanetName(String planetName){this.planetName = planetName;}

    public String getDinhNghia(){return dinhNghia;}
    public void setDinhNghia(String dinhNghia){this.dinhNghia = dinhNghia;}

    public int getImg(){return img;}
    public void setImg(int img){this.img = img;}
}
