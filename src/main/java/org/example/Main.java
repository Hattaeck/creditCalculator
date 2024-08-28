package org.example;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();


        System.out.println("Ежемесячный платеж 1 год: " + service.calculate(12, 1000000, 9.99));

        System.out.println("Ежемесячный платеж 2 года: " + service.calculate(24, 1000000, 9.99));

        System.out.println("Ежемесячный платеж 3 года: " + service.calculate(36, 1000000, 9.99));
    }
}