<%-- 
    Document   : SaveBookToFirebase
    Created on : Aug 23, 2021, 7:40:29 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Books" %>
<% Books books = (Books) session.getAttribute("books"); %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SaveBookToFirebase</title>
        <!-- The core Firebase JS SDK is always required and must be listed first -->
        <script src="https://www.gstatic.com/firebasejs/8.10.0/firebase-app.js"></script>
        <script src="https://www.gstatic.com/firebasejs/8.6.3/firebase-database.js"></script>

        <!-- TODO: Add SDKs for Firebase products that you want to use
             https://firebase.google.com/docs/web/setup#available-libraries -->

        <script>
            // Your web app's Firebase configuration
            var firebaseConfig = {
                apiKey: "AIzaSyDw6Tn7m3n-LDRH_bN30ZejxXVE9krO9BI",
                authDomain: "webaddbook.firebaseapp.com",
                projectId: "webaddbook",
                storageBucket: "webaddbook.appspot.com",
                messagingSenderId: "699881523474",
                appId: "1:699881523474:web:af9192b7466c1f48a48bcb"
            };
            // Initialize Firebase
            firebase.initializeApp(firebaseConfig);
        </script>
    </head>
    <body>
        <h1>Test Firebase 'Books' connection</h1>
        
        <p>
            <input type="button" value="Save" onclick="save_books();" />
        </p>
        
        <script>
            var databaseRef = firebase.database().ref('books/');

            function save_movie() {
                var uid = firebase.database().ref().child('books').push().key;

                var data = {
                    
                    book_name: '<%= books.getAddbookname() %>',
                    book_type: '<%= books.getAddBookType() %>',
                    book_publisher: '<%= books.getAddpublisher()%>',
                    book_printtime:'<%= books.getAddprinttime()%> '
                }

                var updates = {};
                updates['/books/' + uid] = data;
                firebase.database().ref().update(updates);

                alert('Book is created successfully!');
                reload_page();
            }

            function reload_page() {
                window.location.reload();
            }

        </script>
    </body>
</html>
