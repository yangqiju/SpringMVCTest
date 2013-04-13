<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
</head>
<body style="background-color:#E9EEF0">
<%
	String content=3+";URL="+ application.getContextPath() + "/index.html";
	response.setHeader("REFRESH",content); 
%>
<p><center><h1>${errormessage}</h1></center></p>
<p><center>3秒后自动跳转到登陆页，如无反应请点<a href=<%=application.getContextPath() + "/index.html"%>>这里</a><center></p>
</body>
</html>
