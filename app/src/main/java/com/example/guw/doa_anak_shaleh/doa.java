package com.example.guw.doa_anak_shaleh;

/**
 * Created by guw on 07/05/17.
 */

public class doa {
    private int idGambar;
    private String judul;

    public doa (int idGambar, String judul) {
        this.idGambar = idGambar;
        this.judul = judul;
    }

    public int getIdGambar() {
        return idGambar;
    }

    public void setIdGambar(int idGambar) {
        this.idGambar = idGambar;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
}
