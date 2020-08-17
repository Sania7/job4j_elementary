package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int amount = 11;
        while (amount > 0) {
            System.out.println("Player 1, take one to three matches!");
            Scanner sc = new Scanner(System.in);
            int number1 = sc.nextInt();
            if (number1 >= 4 || number1 <= 0) {
                System.out.println("You took the wrong amount!");
            } else {
                amount = amount - number1;
                System.out.println(amount + " matches left.");
                if (amount == 0) {
                    System.out.println("Congratulations, you won!");
                } else {

                    System.out.println("Player 2, take one to three matches!");
                    Scanner scn = new Scanner(System.in);
                    int number2 = scn.nextInt();
                    if (number2 >= 4 || number2 <= 0) {
                        System.out.println("You took the wrong amount!");

                    } else {
                        amount = amount - number2;
                        System.out.println(amount + " matches left.");
                        if (amount == 0) {
                            System.out.println("Congratulations, you won!");
                        }
                    }
                }
            }
        }
    }
}
