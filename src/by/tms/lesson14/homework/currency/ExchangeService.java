package by.tms.lesson14.homework.currency;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExchangeService {

    public static ExchangeRate[] getTodayRates() {

        return new ExchangeRate[]{
                new ExchangeRate(Currency.BYN, BigDecimal.ONE),
                new ExchangeRate(Currency.USD, new BigDecimal("2.7982")),
                new ExchangeRate(Currency.EUR, new BigDecimal("2.9944")),
                new ExchangeRate(Currency.GBP, new BigDecimal("3.3742")),
                new ExchangeRate(Currency.RUB, new BigDecimal("0.037649")),
                new ExchangeRate(Currency.CNY, new BigDecimal("0.40982"))
        };

    }

    public static BigDecimal exchange(Currency inputCurrency, BigDecimal exchangeMoney, Currency exchangeCurrency) {

        BigDecimal inputCurRate = BigDecimal.ZERO;
        BigDecimal outputCurRate = BigDecimal.ZERO;

        ExchangeRate[] currentRate = getTodayRates();

        for (ExchangeRate itm : currentRate) {
            if (inputCurrency == itm.getCurrency()) {
                inputCurRate = itm.getRate();
            }
            if (exchangeCurrency == itm.getCurrency()) {
                outputCurRate = itm.getRate();
            }
        }

        return inputCurRate.multiply(exchangeMoney).divide(outputCurRate, 2, RoundingMode.HALF_UP);
    }
}
