package com.jam;

public class VillenFactory {

    public static Villens createVillen(int i){
        Integer checker = new Integer(i);

        if (checker.equals(1)){
            Altron altron = new Altron();
            //System.out.println("Atron has been created");
            return altron;
        }
        else if (checker.equals(2)){
            Ninjaz ninjaz = new Ninjaz();
            //System.out.println("ninja has been created");
            return ninjaz;
        }
        else
            return null;
    }
}
