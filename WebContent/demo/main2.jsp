<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link rel="stylesheet" href="js/dijit/themes/claro/claro.css">
	<link rel="stylesheet" href="demo.css" />
	<style type="text/css">
	html, body {
    width: 100%;
    height: 100%;
    margin: 0;
    overflow:hidden;
}
<script>dojoConfig = {parseOnLoad: true}</script>
<script src='js/dojo/dojo.js'></script>
<script src='src.js'></script>
<script>
require(["dojo/parser", "dijit/layout/ContentPane", 
                 "dijit/layout/BorderContainer","dijit/layout/TabContainer","dojox/layout/ContentPane"]);</script>
<!-- <script type="text/javascript">
function showKQ() {
	alert(dijit.byId("mainShowContainer"));
	var mainShowContainer = dijit.byId("mainShowContainer");
	var cp2 = new ContentPane({
				title: "Drinks",
				content: "We are known for our drinks.",
				closable:true,
				onClose:function() {
					return confirm("Are you sure you want to close me???");
				}
			  });
	mainShowContainer.addChild(cp2);
	mainShowContainer.selectChild(cp2);
	mainShowContainer.startup();
}
</script> -->
</head>
<body class="claro">
<div class="outerbar">
	<div data-dojo-type="dojox/widget/FisheyeList">
	<div data-dojo-type="dojox/widget/FisheyeListItem" id="kaoqin" onclick="showKQ()" label="我的考勤" iconSrc="images/icon_browser.png"></div>
	<div data-dojo-type="dojox/widget/FisheyeListItem" label="考勤汇总" iconSrc="images/icon_calendar.png"></div>
	<div data-dojo-type="dojox/widget/FisheyeListItem" label="数据导入" onclick="" iconSrc="images/icon_email.png"></div>
	<div data-dojo-type="dojox/widget/FisheyeListItem" label="刷卡记录" iconSrc="images/icon_texteditor.png"></div>
	<div data-dojo-type="dojox/widget/FisheyeListItem" label="部门管理" iconSrc="images/icon_department.jpg"></div>
	<div data-dojo-type="dojox/widget/FisheyeListItem" label="人员管理" iconSrc="images/icon_peoplemanager.jpg"></div>
	<div data-dojo-type="dojox/widget/FisheyeListItem" label="文件上传" iconSrc="images/mfu.png"></div>
	<div data-dojo-type="dojox/widget/FisheyeListItem" label="注销" onclick="logout()" iconSrc="images/logout.jpg"></div>
	</div>
</div>
   <div data-dojo-type="dijit/layout/BorderContainer" data-dojo-props="design:'sidebar', gutters:true, liveSplitters:true" id="borderContainer">
    <div data-dojo-type="dijit/layout/ContentPane" data-dojo-props="splitter:false, region:'leading'" style="width: 100px;">
    <table>
			<tr><td>当前登录：</td><td>XXX</td></tr>
			<tr><td>年假：</td><td>7(天)</td></tr>
			<tr><td>加班：</td><td>XXX</td></tr>
			<tr colspan="2"><td><a href="index.jsp">注销</a><td></tr>
	</table>
 </div>
   <div data-dojo-type="dijit/layout/TabContainer" data-dojo-props="region:'center', tabStrip:true" id="mainShowContainer">
		<div data-dojo-type="dijit/layout/ContentPane" title="欢迎页" data-dojo-props="selected:true, closable:true" id="Welcome">
		欢迎光临！
		</div>
	</div>
</div>
</body>
</html>