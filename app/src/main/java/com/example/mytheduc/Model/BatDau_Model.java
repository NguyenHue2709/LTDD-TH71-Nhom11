package com.example.mytheduc.Model;

public class BatDau_Model {
    public String tenBaiTap;
    public String giay = "30s";
    public BatDau_Model (String tenBaiTap){
        this.setTenBaiTap(tenBaiTap);
    }

    public String getTenBaiTap() {
        return tenBaiTap;
    }

    public void setTenBaiTap(String tenBaiTap) {
        this.tenBaiTap = tenBaiTap;
    }
}
