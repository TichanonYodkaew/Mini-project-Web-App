<%-- 
    Document   : ClientComment
    Created on : Aug 31, 2021, 8:42:35 AM
    Author     : User
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Client comment</title>
    </head>
    <body>
        <form action="AddCommentServlet">
        <h1>Client comment Here</h1>
        <br></br>
        <label>User name:</label>
        <input type="text" name="AddUserName"><br></br>
        <label>Comment date&time</label>
        <input type="datetime-local" name="AddDateTime"><br></br>
        <label>Comment book name:</label>
        <input type="text" name="AddCommentBookName"><br></br>
        <label>Comment here</label>
        <br></br>
        <input type="text" name="AddComment"><br></br>
        <input type="submit" value="Send comment">
        </form>
    </body>
</html>

