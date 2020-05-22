package com.example.mytheduc.Model;

public class ChanPlanet {
    private String nameChan;
    private int imgChan;
    private String huongDanChan;
    public ChanPlanet(String nameChan, int imgChan, String huongDanChan){
        this.nameChan = nameChan;
        this.imgChan = imgChan;
        this.huongDanChan = huongDanChan;
    }

    public String getNameChan() {
        return nameChan;
    }

    public void setNameChan(String nameChan) {
        this.nameChan = nameChan;
    }

    public int getImgChan() {
        return imgChan;
    }

    public void setImgChan(int imgChan) {
        this.imgChan = imgChan;
    }

    public String getHuongDanChan() {
        return huongDanChan;
    }

    public void setHuongDanChan(String huongDanChan) {
        this.huongDanChan = huongDanChan;
    }
}
