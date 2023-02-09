package io.github.cassioamartim;

import io.github.cassioamartim.util.CurrencyConverter;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = scanner.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double quantity = scanner.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.dollarToReal(quantity, dollarPrice));

        scanner.close();
    }

}
