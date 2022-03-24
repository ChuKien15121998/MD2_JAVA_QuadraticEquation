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
        System.out.println(PTB2.toString());
    }
}
