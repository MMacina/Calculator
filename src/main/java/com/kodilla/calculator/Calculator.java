package com.kodilla.calculator;

public class Calculator {

    public int adding(int a, int b){
        return a + b;
    }

    public int subtracting(int a, int b){
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int addingResoult = calculator.adding(2, 3);
        System.out.println("Adding resoult is " +  addingResoult);
        int subtractingResoult = calculator.subtracting(2, 3);
        System.out.println("Subtracting resoult is " +  subtractingResoult);
    }
}
