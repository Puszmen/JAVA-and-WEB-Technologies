package pl.javastart.currencycalc;

import java.math.BigDecimal;
import java.math.RoundingMode;

class ExchangeCalculator {
    static ExchangeResult exchange(BigDecimal base, ExchangeType exchangeType) {
        BigDecimal exchangeRate = exchangeType.getExchangeRate();
        BigDecimal result = base.multiply(exchangeRate).setScale(2, RoundingMode.HALF_UP);
        return new ExchangeResult(base, result, exchangeType);
    }
}