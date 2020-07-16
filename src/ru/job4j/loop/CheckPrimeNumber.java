package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1 || number <= 0){
            prime = false;
        }
        int num = 2;
        while (num < number) {
            if ((number % num) == 0) {
                prime = false;
                break;
            }
            num++;
        }
        return prime;
    }

}







