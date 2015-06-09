package com.company;

/**
 * Created by fauzy on 09/06/2015.
 */
public class TestAndroid {
    public static void main(String[] args) {

        Aplikasi galaxy = new Aplikasi("BBM","Re Volt","Clean Master","CameraLite");
        Aplikasi joy = new Aplikasi("WhatsApp","City Island","Du Saver","Polaris");

        Android pertama = new Android("Samsung","Merah","Taiwan",4.3,galaxy);
        Android kedua = new Android("OPPO","Hitam","Vietnam",4.2,joy);

        System.out.println("Handphone : " + pertama.toString());
        System.out.println("Handphone : " + kedua.toString());

        pertama.setMerk("lenovo");
        pertama.setBuatan("China");
        pertama.setVersi(4.0);
        pertama.setJenis(joy);
        joy.setGame("Real Racing");
        System.out.println("Handphone : " +pertama.toString());
    }
}
