package com.company;

public class QuadraticEquation {
    private double a, b, c;

    // tạo constructor không có tham số
    public QuadraticEquation() {
    }

    // tạo constructor có tham số
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // tạo getter setter
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    // tạo hàm getDiscriminant tính delta
    public double getDiscriminant () {
        double delta =  Math.pow(this.b, 2) - 4 * this.a * this.c;
        return delta;
    }

    // tạo hàm getRoot1 lấy nghiệm thứ nhất
    public double getRoot1() {
        double r1;
        if (this.getDiscriminant() >= 0) {
            r1 = (-this.b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
        } else {
            r1 = 0;
        }
        return r1;
    }

    // tạo hàm getRoot2 lấy nghiệm thứ hai
    public double getRoot2() {
        double r2;
        if (this.getDiscriminant() >= 0) {
            r2 = (-this.b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
        } else {
            r2 = 0;
        }
        return r2;
    }

    // tạo hàm toString
    @Override
    public String toString() {
        if (this.getDiscriminant() < 0) {
            return "The equation has no roots";
        } else if (this.getDiscriminant() == 0) {
            return "The equation has 2 roots r1 = r2 = " + this.getRoot1();
        } else {
            return "The equation has 2 roots r1 = " + this.getRoot1() + " , r2 = " + this.getRoot2();
        }
    }
}
