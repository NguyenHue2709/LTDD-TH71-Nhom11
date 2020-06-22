package com.example.mytheduc.Model;

import com.example.mytheduc.Activity.CaiDatActivity;

public class BatDau_Model {
    public String tenBaiTap;
    private CaiDatActivity caiDatActivity = new CaiDatActivity();
    private long giay;
    public BatDau_Model (String tenBaiTap){
        this.setTenBaiTap(tenBaiTap);
        setGiay(20);
    }

    public String getTenBaiTap() {
        return tenBaiTap;
    }

    public void setTenBaiTap(String tenBaiTap) {
        this.tenBaiTap = tenBaiTap;
    }

    public long getGiay() {
        return giay;
    }

    public void setGiay(long giay) {
        this.giay = giay;
    }
}
