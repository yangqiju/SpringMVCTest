<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
	<link rel="stylesheet" href="js/dijit/themes/claro/claro.css">
	<script>dojoConfig = {parseOnLoad: true}</script>
	<script type="text/javascript" src="js/dojo/dojo.js"></script>
	<script>
		require(["dojo/parser","dijit/form/Button","dijit/form/Form","dijit/form/ValidationTextBox","dojo/ready"]);
	</script>
	<title>登录页</title>
</head>
<body class="claro" style="background-color:#E9EEF0">
<center><h1>考勤管理平台</h1></center>
<hr/>
	<div data-dojo-type="dijit/form/Form" id="myForm" data-dojo-id="myForm" action="login.do" method="post" style="text-align:center">
	<div id="main">
    <table style="border: 1px solid #9f9f9f;"  align="center" cellspacing="10">
        <tr>
            <td>
                <label for="name">用户名：</label>
            </td>
            <td>
                <input type="text" id="name" name="name" required="true" missingMessage="用户名不能为空！" data-dojo-type="dijit/form/ValidationTextBox" value="zhangsan"/>
            </td>
        </tr>
        <tr>
             <td>
                <label for="name">密&nbsp;&nbsp;码：</label>
            </td>
            <td>
                <input type="password" id="pwd" name="pwd" required="true" missingMessage="密码不能为空！"data-dojo-type="dijit/form/ValidationTextBox" value="123456" />
            </td>
        </tr>
		<tr>
          <td>
               <button data-dojo-type="dijit/form/Button" type="submit" name="submitButton" value="Submit" id="login">登陆</button>
            </td>
            <td>
               <button data-dojo-type="dijit/form/Button" type="reset">重置</button>
			 </td>
        </tr>
    </table>
	</div>
	
	</div>
</body>
</html>
