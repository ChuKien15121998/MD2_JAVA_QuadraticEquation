package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a:");
        double a = input.nextDouble();
        System.out.println("Enter b:");
        double b = input.nextDouble();
        System.out.println("Enter c:");
        double c = input.nextDouble();

        QuadraticEquation PTB2 = new QuadraticEquation(a, b, c);

        double delta = PTB2.getDiscriminant();

        if (delta <  0) {
            System.out.println("The equation has no roots");
        } else if (delta == 0) {
            System.out.println("The equation has 2 roots r1 = r2 = " + PTB2.getRoot1());
        } else {
            double r1 = PTB2.getRoot1();
            double r2 = PTB2.getRoot2();
            System.out.println("The equation has 2 roots r1 = " + r1 + " , r2 = " + r2);
        }
    }
}
