package com.kodilla;

class Calculator3 {
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double c, double d) {
        return c - d;
    }
}

class CalculatorRunner {
    public static void main(String[] args) {

        Calculator3 calculator3 = new Calculator3();

        double resultAdd = calculator3.add(1.0 , 3.0);
        System.out.println(resultAdd);

        double resultSub = calculator3.sub(15.0 , 10.0);
        System.out.println(resultSub);
    }
}
