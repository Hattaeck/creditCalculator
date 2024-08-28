package org.example;

public class CreditPaymentService {

    public double calculate(int monthlyCreditTime, int creditSumm, double yearPercentRate) {

        double monthlyInterestRate = yearPercentRate / 12 / 100;

        double annuityPayment = creditSumm * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, monthlyCreditTime) /
                (Math.pow(1 + monthlyInterestRate, monthlyCreditTime) - 1);

        return annuityPayment;
    }
}