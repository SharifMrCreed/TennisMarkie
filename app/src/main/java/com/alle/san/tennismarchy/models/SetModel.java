package com.alle.san.tennismarchy.models;

public class SetModel {
    private int aGames;
    private int bGames;

    @Override
    public String toString() {
        return "SetModel{" +
                "aGames=" + aGames +
                ", bGames=" + bGames +
                '}';
    }

    public int getaGames() {
        return aGames;
    }

    public void setaGames(int aGames) {
        this.aGames = aGames;
    }


    public int getbGames() {
        return bGames;
    }

    public void setbGames(int bGames) {
        this.bGames = bGames;
    }

    public SetModel(int aGames, int bGames) {
        this.aGames = aGames;
        this.bGames = bGames;
    }
}
