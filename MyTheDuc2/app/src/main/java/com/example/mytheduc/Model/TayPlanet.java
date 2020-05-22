package com.example.mytheduc.Model;

public class TayPlanet {
    private String nameTay;
    private int imgTay;
    private String huongDanTay;
    public TayPlanet(String nameTay, int imgTay, String huongDanTay){
        this.nameTay = nameTay;
        this.imgTay = imgTay;
        this.huongDanTay = huongDanTay;
    }

    public String getNameTay() {
        return nameTay;
    }

    public void setNameTay(String nameTay) {
        this.nameTay = nameTay;
    }

    public int getImgTay() {
        return imgTay;
    }

    public void setImgTay(int imgTay) {
        this.imgTay = imgTay;
    }

    public String getHuongDanTay() {
        return huongDanTay;
    }

    public void setHuongDanTay(String huongDanTay) {
        this.huongDanTay = huongDanTay;
    }
}
