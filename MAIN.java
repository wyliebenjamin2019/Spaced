package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double x1= 5;
        double x2=4;
        double x3=-3;
        double y1=2;
        double y2=9;
        double y3=2;
        double z1=-5;
        double z2=2;
        double z3=6;
        double d1=Math.sqrt(Math.pow(y1-y2,2)+Math.pow(x1-x2,2)+Math.pow(z1-z2,2));
        double d2=Math.sqrt(Math.pow(y2-y3,2)+Math.pow(x2-x3,2)+Math.pow(z2-z3,2));
        double d3=Math.sqrt(Math.pow(y3-y1,2)+Math.pow(x3-x1,2)+Math.pow(z3-z1,2));
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
