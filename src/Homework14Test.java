import by.tms.lesson14.homework.currency.Currency;
import by.tms.lesson14.homework.currency.ExchangeRate;
import by.tms.lesson14.homework.currency.ExchangeService;

import java.math.BigDecimal;
import java.util.Scanner;

public class Homework14Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                """
                        Choose task:
                        1. Current exchanges rate
                        2. Calculate exchanges
                        0. Exit"""
        );
        while (true) {
            System.out.println("Task number: ");
            int taskNumber = Integer.parseInt(scanner.nextLine());
            switch (taskNumber) {
                case 1 -> {
                    System.out.println("Current exchanges rates are: ");
                    System.out.format("%s %20s %10s", "Currency", "Code", "Rate");
                    System.out.println();
                    System.out.println("--------------------------------------------");
                    for (ExchangeRate itm : ExchangeService.getTodayRates()) {
                        if (itm.getCurrency() != Currency.BYN) {
                            System.out.printf("%-24s %-10s %s", itm.getCurrency().getRusCurrencyName(),
                                    itm.getCurrency(), itm.getRate());
                            System.out.println();
                        }
                    }
                }
                case 2 -> {
                    System.out.print("Input your currency code: ");
                    Currency inputCurrencyCode = Currency.valueOf(scanner.nextLine());
                    System.out.print("Input currency code you want to receive: ");
                    Currency outputCurrencyCode = Currency.valueOf(scanner.nextLine());
                    System.out.print("Input amount: ");
                    BigDecimal inputCurrency = BigDecimal.valueOf(Integer.parseInt(scanner.nextLine()));
                    System.out.println(ExchangeService.exchange(inputCurrencyCode, inputCurrency, outputCurrencyCode));
                }
                case 0 -> {
                    return;
                }
                default -> System.err.println("Task doesn't exist");
            }
            System.out.println();
        }
    }

}