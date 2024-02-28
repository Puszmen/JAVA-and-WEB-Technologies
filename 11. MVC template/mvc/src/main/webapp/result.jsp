<%@ page import="pl.javastart.currencycalc.ExchangeResult" %>
<%@ page import="java.math.BigDecimal" %>
<%@ page import="pl.javastart.currencycalc.ExchangeType" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Kantor - wynik</title>
</head>
<body>
    <%
        ExchangeResult exchangeResult = (ExchangeResult) request.getAttribute("result");
        BigDecimal base = exchangeResult.getBase();
        BigDecimal result = exchangeResult.getResult();
        ExchangeType exchangeType = exchangeResult.getExchangeType();
        String baseCurrency = exchangeType.getBaseCurrency();
        String targetCurrency = exchangeType.getTargetCurrency();
    %>

    <h2>
        <%= String.format("%s%s to %s%s", base.toString(), baseCurrency, result.toString(), targetCurrency) %>
    </h2>

</body>
</html>
