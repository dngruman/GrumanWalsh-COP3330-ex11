/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Deirdre Gruman-Walsh
 */
import java.util.Scanner;
public class ConversionCurrancy {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        double result = 0.0;

        System.out.print("How many Euros are you exchanging? ");
        double euros = user_input.nextDouble();
        System.out.print("What is the exchange rate? ");
        double exchangeRate = user_input.nextDouble();
        double dollars = currencyConverter(euros, exchangeRate,result);

        System.out.println(euros + " Euros at an Exchange rate of " + exchangeRate + " is ");
        System.out.println(String.format("%.2f", dollars) + " U.S. Dollars ");

        user_input.close();
    }

    private static double currencyConverter(double euros, double exchangeRate,double result) {
        return result = euros * exchangeRate;

    }

}