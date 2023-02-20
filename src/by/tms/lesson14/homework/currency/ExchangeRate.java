package by.tms.lesson14.homework.currency;

import java.math.BigDecimal;

public class ExchangeRate {

    private Currency currency;
    private BigDecimal rate;

    public ExchangeRate getExchangeRate(Currency currency){

        ExchangeRate exchangeRate = new ExchangeRate();
        exchangeRate.currency = currency;
        exchangeRate.rate = currentRates(currency);

        return exchangeRate;
    }
    private static BigDecimal currentRates(Currency currency) {

        switch (currency) {
            case USD -> {
                return BigDecimal.valueOf(2.7982);
            }
            case EUR -> {
                return BigDecimal.valueOf(2.9944);
            }
            case GBP -> {
                return BigDecimal.valueOf(3.3742);
            }
            case RUB -> {
                return BigDecimal.valueOf(0.037649);
            }
            case CNY -> {
                return BigDecimal.valueOf(0.40982);
            }
        }
        return BigDecimal.valueOf(1.0);
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return currency + " -> " + rate;
    }
}

