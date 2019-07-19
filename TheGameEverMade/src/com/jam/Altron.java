package com.jam;

public class Altron implements Villens{

    private int altronHealth;
    private int altronPower;
    private String altronName;

    public Altron() {
        altronHealth = 5;
        altronPower = 15;
        altronName = "Altron";
    }

    public int getVillenHealth() {
        return altronHealth;
    }

    public int getVillenPower() {
        return altronPower;
    }

    public String getVillenName() {
        return altronName;
    }


}

