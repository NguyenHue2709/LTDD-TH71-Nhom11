package com.example.mytheduc.Model;

public class BungPlanet {
    private String nameBung;
    private int imgBung;
    private String huongDanBung;

    public BungPlanet(String nameBung, int imgBung, String huongDanBung){
        this.nameBung = nameBung;
        this.imgBung = imgBung;
        this.huongDanBung = huongDanBung;
    }

    public String getNameBung() {
        return nameBung;
    }

    public void setNameBung(String nameBung) {
        this.nameBung = nameBung;
    }

    public int getImgBung() {
        return imgBung;
    }

    public void setImgBung(int imgBung) {
        this.imgBung = imgBung;
    }

    public String getHuongDanBung() {
        return huongDanBung;
    }

    public void setHuongDanBung(String huongDanBung) {
        this.huongDanBung = huongDanBung;
    }
}
