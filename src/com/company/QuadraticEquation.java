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
        double delta =  b*b - 4*a*c;
        return delta;
    }

    // tạo hàm getRoot1 lấy nghiệm thứ nhất
    public double getRoot1() {
        double r1 = (-b + Math.pow(b*b-4*a*c, 0.5)) / (2*a);
        return r1;
    }

    // tạo hàm getRoot2 lấy nghiệm thứ hai
    public double getRoot2() {
        double r2 = (-b - Math.pow(b*b-4*a*c, 0.5)) / (2*a);
        return r2;
    }

}
