package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int amount = 11;
        boolean prime = true;
        String name = " ";
        name = player ? "игрок_1" : "игрок_2";
        while (amount > 0) {

            System.out.println("Player 1, take one to three matches!");
            Scanner sc = new Scanner(System.in);
            int number1 = sc.nextInt();
            if (number1 >= 4 || number1 <= 0) {
                System.out.println("You took the wrong amount!");
            } else {
                amount = amount - number1;
                System.out.println(amount + " matches left.");

            }
            if (amount == 0) {
                System.out.println("Congratulations, you won!");
                break;
            }
        }

    }
}
