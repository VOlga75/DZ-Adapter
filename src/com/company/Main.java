package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Работа класса Calculator");
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );

        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.POW)
                        .result()
        );
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.SUM)
                        .result()
        );

        System.out.println("\nТе же операции с использованием класса-адаптера");

        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.mult(5, 15));
        System.out.println(intsCalc.pow(5, 15));
        System.out.println(intsCalc.sum(5, 15));
    }
}

