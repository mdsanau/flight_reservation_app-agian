<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New login</title>
</head>
<body>
 <h2>Login Here</h2>
 ${error}
 <form action = "verifyLogin" method = "post">
 Email id<input type = "text" name = "email"/>
 Password<input type = "text" name = "password"/>
 <input type = "submit" value = "login">
 </form>
 
</html>