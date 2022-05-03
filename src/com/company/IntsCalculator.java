package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return (int) Math.round(
                target.newFormula()
                        .addOperand(arg0)
                        .addOperand(arg1)
                        .calculate(Calculator.Operation.SUM)
                        .result()
        );
    }

    @Override
    public int mult(int arg0, int arg1) {
        return (int) Math.round(
                target.newFormula()
                        .addOperand(arg0)
                        .addOperand(arg1)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );
    }

    @Override
    public BigInteger pow(int a, int b) {
        Double rez = target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        BigInteger i = BigDecimal.valueOf(rez).setScale(0, RoundingMode.UP).toBigInteger();

        return i;
    }
}

