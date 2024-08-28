package org.example;

public class CreditPaymentService {

    public double calculate(int monthlyCreditTime, int creditSumm, double yearPercentRate) {

            double annuityPayment = creditSumm * monthlyCreditTime * Math.pow(1 + monthlyCreditTime, creditSumm) /
                    (Math.pow(1 + monthlyCreditTime, creditSumm) - 1);

            return annuityPayment;
        }
    }
