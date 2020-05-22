package com.example.mytheduc.Model;

public class BayPhutPlanet {
    private String bayPhut;
    private String dinhNghiaBayPhut;

    public BayPhutPlanet (String bayPhut, String dinhNghia){
        this.bayPhut = bayPhut;
        this.dinhNghiaBayPhut = dinhNghia;
    }

    public String getBayPhut() {
        return bayPhut;
    }
    public void setBayPhut(String bayPhut) {
        this.bayPhut = bayPhut;
    }

    public String getDinhNghiaBayPhut() {
        return dinhNghiaBayPhut;
    }

    public void setDinhNghia(String dinhNghia) {
        this.dinhNghiaBayPhut = dinhNghiaBayPhut;
    }
}
