package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int remain = 0;
        int amount = 11;
        while (amount > remain) {
            System.out.println("Player, take one to three matches ;) ");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            System.out.println("You took " + number + ".");
            amount = amount - number;
            System.out.println(amount + " matches left.");
            if (amount == remain) {
                System.out.println("Congratulations, you won!");
                break;
            }
        }
    }
}
