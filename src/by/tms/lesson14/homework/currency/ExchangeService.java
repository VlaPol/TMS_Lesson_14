package by.tms.lesson14.homework.currency;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExchangeService {

    public static ExchangeRate[] getTodayRates() {

        ExchangeRate[] exchangeRates = new ExchangeRate[6];
        Currency[] currencyArray = Currency.values();

        int i = 0;
        for (Currency itm : currencyArray) {
            exchangeRates[i] = new ExchangeRate().getExchangeRate(itm);
            i++;
        }

        return exchangeRates;
    }

    public static BigDecimal exchange(Currency inputCurrency, BigDecimal exchangeMoney, Currency exchangeCurrency) {

        BigDecimal inputCurRate = new BigDecimal(0);
        BigDecimal outputCurRate = new BigDecimal(0);

        if (exchangeMoney.compareTo(BigDecimal.ZERO) == 0) {
            return BigDecimal.valueOf(0);
        }
        ExchangeRate[] currentRate = getTodayRates();

        for (ExchangeRate itm : currentRate) {
            if (inputCurrency == itm.getCurrency()) {
                inputCurRate = itm.getRate();
            }
            if (exchangeCurrency == itm.getCurrency()) {
                outputCurRate = itm.getRate();
            }
        }

        if (exchangeCurrency != Currency.BYN) {
            return outputCurRate.compareTo(BigDecimal.ZERO) == 0
                    ? BigDecimal.valueOf(0)
                    : (inputCurRate.multiply(exchangeMoney).divide(outputCurRate,2, RoundingMode.HALF_UP));
        } else {
            return inputCurRate.multiply(exchangeMoney);
        }
    }
}
