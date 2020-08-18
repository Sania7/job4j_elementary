package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int amount = 11;
        boolean player = true;
        String name = "";
        while (amount > 0) {
            name = player ? "Player 1" : "Player 2";
            System.out.println(name + " , take one to three matches!");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            if (number >= 4 || number <= 0 || amount - number < 0) {
                System.out.println("You took the wrong amount!");
                System.out.println("You can take " + amount  + " matches");
            } else {
                amount = amount - number;
                if (amount == 0) {
                    break;
                }
                System.out.println(amount + " matches left.");
                player = !player;
            }
        }
            System.out.println("Congratulations, " + name + " won!");
    }
}
