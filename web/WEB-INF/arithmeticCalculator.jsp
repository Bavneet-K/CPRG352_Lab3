<%-- 
    Document   : arithmeticCalculator
    Created on : 4 Feb, 2022, 6:42:15 PM
    Author     : Bavneet
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
        
        <form action="arithmetic" method="post">
            First: <input type="text" name="first_num" value="${first}"><br>
            Second: <input type="text" name="second_num" value="${second}"><br>
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="/">
        </form>
        <br>
        <div>
            Result: ${result}
        </div>
        <div>
            <a href="age">Age calculator</a>
        </div>
    </body>
</html>
