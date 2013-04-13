<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello World</title>
</head>
<body>
	<form action="http://localhost:8080/SpringMVCTest/rest/user/postmethod"
		method="post">
		<input type="submit" value="post">
	</form>
	<br/>
	<form action="http://localhost:8080/SpringMVCTest/rest/user"
		method="post">
		<input type="hidden" name="_method" value="put"/>
		<input type="submit" value="put">
	</form>
	<br/>
	<form action="http://localhost:8080/SpringMVCTest/rest/user"
		method="post">
		<input type="hidden" name="_method" value="get"/>
		<input type="submit" value="get">
	</form>
	<br/>
	<form action="http://localhost:8080/SpringMVCTest/rest/user"
		method="post">
		<input type="hidden" name="_method" value="delete"/>
		<input type="submit" value="delete">
	</form>
	<br/>
</body>
</html>
