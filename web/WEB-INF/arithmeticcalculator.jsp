<%-- 
    Document   : arithmeticcalculator
    Created on : May 29, 2021, 3:13:33 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First: </label>
            <input type="text" name="first_value" value="">
            <br>
            <label>Second: </label>
            <input type="text" name="second_value" value="">
            <br>
            <input type="submit" name="calculation" value="+">
            <input type="submit" name="calculation" value="-">
            <input type="submit" name="calculation" value="*">
            <input type="submit" name="calculation" value="%">
        </form>
        
        <p>Result: ${result}</p>
        <a href="age">Age calculator</a>
        
    </body>
</html>
