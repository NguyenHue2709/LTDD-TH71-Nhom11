package com.example.mytheduc.Model;

import android.widget.ImageView;

public class CoDienPlanet {
    private String nameCoDien;
    private int imgCoDien;
    private String huongDanCoDien;

    public CoDienPlanet(String nameCoDien, int imgCoDien, String huongDanCoDien){
        this.nameCoDien = nameCoDien;
        this.imgCoDien = imgCoDien;
        this.huongDanCoDien = huongDanCoDien;
    }

    public String getNameCoDien() {
        return nameCoDien;
    }

    public void setNameCoDien(String nameCoDien) {
        this.nameCoDien = nameCoDien;
    }

    public int getImgCoDien() {
        return imgCoDien;
    }

    public void setImgCoDien(int imgCoDien) {
        this.imgCoDien = imgCoDien;
    }

    public String getHuongDanCoDien() {
        return huongDanCoDien;
    }

    public void setHuongDanCoDien(String huongDanCoDien) {
        this.huongDanCoDien = huongDanCoDien;
    }
}
