<%-- 
    Document   : UpdateBooks
    Created on : Jul 21, 2021, 9:14:46 PM
    Author     : 63114540074
    Objective  : Allow user update books
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Books" %>

<!-- get session object book -->
<% Books books = (Books) session.getAttribute("books");%>
<head>
        <title>UpdateBooks</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
<h2>Edit Book info</h2>
<form action="AddNewBookServlet">
    <label>Name:</label>
    <input type="text" name="Addbookname" value="<%= books.getAddbookname()%>"><br/>
    <br/>
    <label>Type:</label>
    <select name="Addbooktype">
        <option value="COMMIC">Comic</option>
        <option value="NONFICTION">Non - Fiction</option>
        <option value="FICTION">Fiction</option>
        <option value="REFERENCEBOOK">Reference Book</option>        
    </select><br/>
    <br/>
    <label>Publisher:</label>
    <input type="text" name="Addpublisher" value="<%= books.getAddpublisher()%>"><br/>
    <br/>
    <label>Print time:</label><br/>
    <input type="radio" id="1" name="Addprinttime" value="1" >
    <label for="1">1</label><br/>

    <input type="radio" id="2" name="Addprinttime" value="2" >
    <label for="2">2</label><br/>

    <input type="radio" id="3" name="Addprinttime" value="3" >
    <label for="3">3</label><br/>

    <input type="radio" id="4" name="Addprinttime" value="4" >
    <label for="4">4</label><br/>
    <br/>
    <input type="submit" value="Updatebook">



</form>