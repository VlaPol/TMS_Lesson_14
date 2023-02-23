package by.tms.lesson14.homework.currency;

import java.math.BigDecimal;
import java.math.MathContext;

public class ExchangeRate {

    private final Currency currency;
    private final BigDecimal rate;


    public ExchangeRate(Currency currency, BigDecimal rate) {
        if(rate.compareTo(BigDecimal.ZERO) == 0){
            throw new IllegalArgumentException("Invalid rate");
        }
        this.currency = currency;
        this.rate = rate;
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getRate() {
        return rate.round(new MathContext(5));
    }

    @Override
    public String toString() {
        return currency + " -> " + rate.round(new MathContext(5));
    }
}

