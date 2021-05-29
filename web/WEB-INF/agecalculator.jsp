<%-- 
    Document   : agecalculator
    Created on : May 29, 2021, 2:33:34 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label>Enter your age:  </label>
            <input type ="text" name="age_input" value="">
            <br>
            <input type="submit" vale="Age next birthday">
        </form>
        <p>${message}</p>
        <p>${result}</p>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
