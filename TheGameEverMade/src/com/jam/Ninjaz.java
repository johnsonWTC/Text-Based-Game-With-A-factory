package com.jam;

public class Ninjaz implements Villens{

    private int ninjaHealth;
    private int ninjaPower;
    private String ninjaName;

    public Ninjaz() {
        ninjaHealth = 15;
        ninjaPower = 5;
        ninjaName = "ninja";

    }

    public String getVillenName() {
        return ninjaName;
    }

    public int getVillenHealth() {
        return ninjaHealth;
    }

    public int getVillenPower() {
        return ninjaPower;
    }
}
