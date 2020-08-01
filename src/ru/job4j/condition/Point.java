package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private int x;
    private int y;
    private int z;
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
    public Point(int first, int second, int z) {
        this.x = first;
        this.y = second;
        this.z = z;
    }
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }
    public double distance3D(Point that) {
      return Math.sqrt(Math.pow(this.x - that.x, 2) + (Math.pow(this.y - that.y, 2) + (Math.pow(this.z - that.z, 2))));
    }
     public static void main(String[] args) {
     Point a = new Point(0, 0);
     Point b = new Point(0, 2);
     Point z = new Point(0, 0, 2);
     Point w = new Point(0, 0, 0);
     double dist = a.distance(b);
     double dist3 = z.distance3D(w);
        System.out.println("2 D = " + dist);
        System.out.println("3 D = " + dist3);
    }
}
