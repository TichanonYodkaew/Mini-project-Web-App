
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Books detail</title>
    </head>
    <body>
        <h2>Books Client</h2>
        <br/>
        <form action="showBooksFromREST">
            <label>Book name:</label>
            <input type='text' name='BooksName'><br/>
            <br/>
            <input type='submit' value='get from REST'>
        </form>
    </body>
</html>
