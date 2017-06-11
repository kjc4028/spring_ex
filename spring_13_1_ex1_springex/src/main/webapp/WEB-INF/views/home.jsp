<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<form method="post" action="http://localhost:8282/ex/member/join">
<input type="text" name ="name"><br>
<input type="text" name ="id"><br>
<input type="text" name ="pw"><br>
<input type="text" name ="email"><br>
<input type="submit" value="가입">

</form>
</body>
</html>
