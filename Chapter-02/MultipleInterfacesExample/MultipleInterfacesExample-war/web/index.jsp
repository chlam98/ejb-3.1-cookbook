<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<f:view>
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account</title>
    </head>
    <body>
        <h1>Discount Rates</h1>
        <h:form>
            <h:outputText value="Corporate Discount: #{account.corporateDiscount}"/><br/>
            <h:outputText value="Non-Profit Discount: #{account.nonProfitDiscount}"/><br/>
        </h:form>
    </body>
</html>
</f:view>
