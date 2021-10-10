<%-- 
    Document   : ClientBorrowBook
    Created on : Sep 5, 2021, 9:05:15 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Borrow book</title>
    </head>
    <body>
        <h2>Borrow book</h2>
        <form action="ClientBorrowBookServlet">
            <label>User name:</label>
            <input type="text" name="BorrowUserName"><br/>     
            <br/>
            <label>Book name:</label>
            <input type='text' name='BorrowBooksName'><br/>
            <br/>
            <input type='submit' value='Borrow'>
        </form>
    </body>
</html>
