package ru.job4j.live;

public class Loop {

    public static void draw(int size) {
        for (int x = 0; x <= size; x++) {
            for (int i = 0; i < size; i++) {
                
            }
            if (x % 2 == 0) {
                System.out.print("X");
            } else {
                System.out.print(" ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Строка");
        draw(10);
    }
}