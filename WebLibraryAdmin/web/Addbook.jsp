<%-- 
    Document   : Addbook
    Created on : Jul 21, 2021, 8:19:01 PM
    Author     : 63114540074
    Objective  : Add books to database
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
    <title>Add book</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
<h1>Add books</h1>
<form action="AddNewBookServlet">
    <label>Name:</label>
    <input type="text" name="Addbookname"><br/>

    <label>Type:</label>
    <select name="Addbooktype">
        <option value="COMMIC">Comic</option>
        <option value="NONFICTION">Non - Fiction</option>
        <option value="FICTION">Fiction</option>
        <option value="REFERENCEBOOK">Reference Book</option>        
    </select><br/>

    <label>Publisher:</label><br/>
    <input type="text" name="Addpublisher"><br/>

    <label>Print time:</label><br/>
    <br/>
    <input type="radio" id="1" name="Addprinttime" value="1" >
    <label for="1">1</label><br/>

    <input type="radio" id="2" name="Addprinttime" value="2" >
    <label for="2">2</label><br/>

    <input type="radio" id="3" name="Addprinttime" value="3" >
    <label for="3">3</label><br/>

    <input type="radio" id="4" name="Addprinttime" value="4" >
    <label for="4">4</label><br/>
    <br/>
    <input type="submit" value="Addbook">



</form>