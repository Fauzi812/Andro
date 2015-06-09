package com.company;

/**
 * Created by fauzy on 09/06/2015.
 */
public class Aplikasi {
    private String sosmed;
    private String game;
    private String care;
    private String editor;

    public Aplikasi(String sosmed, String game, String care, String editor) {
        this.sosmed = sosmed;
        this.game = game;
        this.care = care;
        this.editor = editor;
    }

    public Aplikasi(String sosmed, String game) {
        this.sosmed = sosmed;
        this.game = game;
    }

    public Aplikasi(String sosmed, String game, String care) {
        this.sosmed = sosmed;
        this.game = game;
        this.care = care;
    }

    public String getSosmed() {
        return sosmed;
    }

    public void setSosmed(String sosmed) {
        this.sosmed = sosmed;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getCare() {
        return care;
    }

    public void setCare(String care) {
        this.care = care;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Aplikasi{" +
                "sosmed='" + sosmed + '\'' +
                ", game='" + game + '\'' +
                ", care='" + care + '\'' +
                ", editor='" + editor + '\'' +
                '}';
    }
}
