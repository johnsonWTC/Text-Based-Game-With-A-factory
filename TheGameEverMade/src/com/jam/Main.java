package com.jam;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Boolean running = true;
        int playerPortion = 30;
        int portionNum = 3;
        int playerPower = 25;
        int playerHealth = 150;
        int playerScore = 0;


         System.out.println("Welcome to the best game ever maade");
        System.out.println("=====================================");
        Game:
        while(running){
            Villens villens = VillenFactory.createVillen((random.nextInt(2) +1));
            int villenPower = random.nextInt((villens.getVillenPower()));
            int villenHealth = random.nextInt(villens.getVillenHealth());
            System.out.println(villens.getVillenName() +" has appeared, your score is "+ playerScore);
            System.out.println("1. do you fight?");
            System.out.println("2. do drink a potion");
            System.out.println("3 do you run");
            String input = scanner.nextLine();

            while(villenHealth > 1) {

                if (input.equals("1")) {
                    System.out.println("you are fighting " + villens.getVillenName());
                    villenHealth = villenHealth - playerPower ;
                    playerHealth = playerHealth - villenPower;
                    System.out.println(" hit you, and your health is now " + playerHealth);
                        if(villenHealth < 0){
                            System.out.println("the villen is dead");
                            playerScore++;
                            break;
                        }
                } else if (input.equals("2")) {
                    System.out.println("you are drinking from the portion");

                } else if (input.equals("3")) {
                    System.out.println("you are running from  " + villens.getVillenName());
                } else
                    break;
            }

        }




    }
}
