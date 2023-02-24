package by.tms.lesson14.homework.currency;

public enum Currency {
    BYN("Белорусский рубль"),
    USD("Доллар США"),
    EUR("Евро"),
    GBP("Фунт стерлингов"),
    RUB("Российский рубль"),
    CNY("Китайский юань");

    private final String currencyRusNaming;

    Currency(String currencyRusNaming) {
        this.currencyRusNaming = currencyRusNaming;
    }

    public String getRusCurrencyName() {
        return currencyRusNaming;
    }
}
