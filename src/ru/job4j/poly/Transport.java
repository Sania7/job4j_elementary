package ru.job4j.poly;

public interface Transport {
   public void drive();

   public void passengers(int amount);

   public int refuel(int fuel, double price);
}
