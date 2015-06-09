package com.company;

/**
 * Created by fauzy on 09/06/2015.
 */
public class Android {
    private String merk;
    private String warna;
    private String buatan;
    private Double versi;
    private Aplikasi jenis;

    public Android(String merk, String warna, String buatan, Double versi, Aplikasi jenis) {
        this.merk = merk;
        this.warna = warna;
        this.buatan = buatan;
        this.versi = versi;
        this.jenis = jenis;
    }

    public Android(String merk, String warna, String buatan, Aplikasi jenis) {
        this.merk = merk;
        this.warna = warna;
        this.buatan = buatan;
        this.jenis = jenis;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBuatan() {
        return buatan;
    }

    public void setBuatan(String buatan) {
        this.buatan = buatan;
    }

    public Double getVersi() {
        return versi;
    }

    public void setVersi(Double versi) {
        this.versi = versi;
    }

    public Aplikasi getJenis() {
        return jenis;
    }

    public void setJenis(Aplikasi jenis) {
        this.jenis = jenis;
    }

    @Override
    public String toString() {
        return "Android{" +
                "merk='" + merk + '\'' +
                ", warna='" + warna + '\'' +
                ", buatan='" + buatan + '\'' +
                ", versi=" + versi +
                ", jenis=" + jenis +
                '}';
    }
}
