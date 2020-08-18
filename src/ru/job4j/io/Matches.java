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
            int number1 = sc.nextInt();
            if (number1 >= 4 || number1 <= 0) {
                System.out.println("You took the wrong amount!");
            } else {
                amount = amount - number1;
                if (amount == 0) {
                    break;
                }
                System.out.println(amount + " matches left.");
                player = !player;
            }
        }
        System.out.println("Congratulations," + player + " won!");
    }
}

