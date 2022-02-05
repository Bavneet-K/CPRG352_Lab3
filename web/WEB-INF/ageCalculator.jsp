<%-- 
    Document   : ageCalculator
    Created on : 4 Feb, 2022, 6:41:24 PM
    Author     : Bavneet
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
        
        <form action="age" method="post">
            Enter your age: <input type="text" name="input_age" value="${age}"><br>
            <input type="submit" name="calculateAge" value="Age next birthday">
        </form>
        <br>
        <div>
            ${result}
        </div>
        <div>
            <a href="arithmetic">Arithmetic calculator</a>
        </div>
    </body>
</html>
