<%-- 
    Document   : createRecord
    Created on : Nov 3, 2015, 5:19:26 PM
    Author     : John Phillips
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Player Database</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="mystyle.css">
    </head>
    <body>
        <h1><a href="home.html">Player Database</a></h1>
        <h2>Create New Player Record</h2>
        <form action="create" method="get">

            Number: <input type="text" name="number" size="100" placeholder="Enter Player Number" required>
            <br><br>
            Last Name: <input type="text" name="lastName" size="100" placeholder="Enter Last Name" required>
            <br><br>            
            First Name: <input type="text" name="firstName" size="100" placeholder="Enter First Name" required>
            <br><br>
            Position: <input type="number" name="position" placeholder="Position" required>
            <br><br>

            <input type="hidden" name="action" value="createRecord">

            <input type="submit" name="submit" value="Submit">
            <br><br>
        </form>
    </body>
</html>

