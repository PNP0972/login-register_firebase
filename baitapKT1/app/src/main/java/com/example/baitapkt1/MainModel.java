package com.example.baitapkt1;

public class MainModel {
    String tenkhoahoc, tenthuonggoi, dattinh, congdung, lieudung, luuykhidung, sufl;

    MainModel() {

    }

    public MainModel(String tenkhoahoc, String tenthuonggoi, String dattinh, String congdung, String lieudung, String luuykhidung, String sufl) {
        this.tenkhoahoc = tenkhoahoc;
        this.tenthuonggoi = tenthuonggoi;
        this.dattinh = dattinh;
        this.congdung = congdung;
        this.lieudung = lieudung;
        this.luuykhidung = luuykhidung;
        this.sufl = sufl;
    }

    public String getTenkhoahoc() {
        return tenkhoahoc;
    }

    public String getTenthuonggoi() {
        return tenthuonggoi;
    }

    public String getDattinh() {
        return dattinh;
    }

    public String getCongdung() {
        return congdung;
    }

    public String getLieudung() {
        return lieudung;
    }

    public String getLuuykhidung() {
        return luuykhidung;
    }

    public String getSufl() {
        return sufl;
    }
}