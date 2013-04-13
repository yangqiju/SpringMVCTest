<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link rel="stylesheet" href="js/dijit/themes/claro/claro.css" />
	<link rel="stylesheet" href="demo.css"/>
	<!-- <link ref="stylesheet" href="js/dojox/widget/FisheyeList/FisheyeList.css"> -->
	<title>考勤管理平台</title>
<style type="text/css">
	html, body {
    width: 100%;
    height: 100%;
    margin: 0;
    overflow:hidden;
	}
#borderContainer {
    width: 100%;
    height: 100%;
}</style>
<script src='js/dojo/dojo.js'></script>
<script type="text/javascript">
	require(["dojo/ready","dojox/widget/FisheyeList","dojo/parser","dojox/widget/FisheyeListItem","dojox/layout/ContentPane","dijit/Dialog"],
			function(ready,fishEyeList,parser,FishEyeListItem,ContentPane,Dialog){
		dojo.addOnLoad(function(){
			parser.parse();
		});
		ready(function(){
			var showKQ = function(){
				var mainShow = dijit.byId("mainShowContainer");
				var childTab = new ContentPane({
				title: "我的考勤",
				href:"kaoqin/myKQ.jsp",
				closable:true,
				onClose:function() {
					return confirm("Are you sure you want to close me???");
				}
			});
			var showDialog = function(){
				var dialog = new Dialog({
					
					
				});
				
			}
			mainShow.addChild(childTab);
			mainShow.selectChild(childTab); 
			}
			dijit.byId("kaoqin").on("click",showKQ);
		});
	});
</script>
</head>
<body class="claro">
<div class="outerbar">
	<div data-dojo-type="dojox/widget/FisheyeList" id="testFishEye">
	<div id="kaoqin" data-dojo-type="dojox/widget/FisheyeListItem" label="我的考勤" iconSrc="images/icon_browser.png">
	</div>
	<div data-dojo-type="dojox/widget/FisheyeListItem" label="数据导入" iconSrc="images/mfu.png"></div>
	<div data-dojo-type="dojox/widget/FisheyeListItem" label="权限管理" onclick="" iconSrc="images/icon_email.png"></div>
	<div data-dojo-type="dojox/widget/FisheyeListItem" label="角色管理" iconSrc="images/icon_texteditor.png"></div>
	<div data-dojo-type="dojox/widget/FisheyeListItem" label="部门管理" iconSrc="images/icon_department.jpg"></div>
	<div data-dojo-type="dojox/widget/FisheyeListItem" label="人员管理" iconSrc="images/icon_peoplemanager.jpg"></div>
	<div data-dojo-type="dojox/widget/FisheyeListItem" label="请假管理" iconSrc="images/icon_peoplemanager.jpg"></div>
	</div>
</div>
    <div data-dojo-type="dijit/layout/BorderContainer" data-dojo-props="design:'sidebar', gutters:true, liveSplitters:true" id="borderContainer">
    <div data-dojo-type="dijit/layout/ContentPane" data-dojo-props="splitter:false, region:'leading'" style="width: 200px;">
    	<table>
			<tr><td>当前登录：</td><td>${username}</td></tr>
			<tr><td>剩余年假：</td><td>${annualLeave}(天)</td></tr>
			<tr><td>加班：</td><td>${overWork}(小时)</td></tr>
			<tr colspan="2"><td><a href="index.jsp">注销</a><td></tr>
		</table>
    </div>
    
    <div data-dojo-type="dijit/layout/TabContainer" data-dojo-props="region:'center', tabStrip:true" id="mainShowContainer">
		<div data-dojo-type="dijit/layout/ContentPane" title="欢迎页" data-dojo-props="selected:true, closable:true" id="Welcome">
			欢迎光临！
			!!!!!!!!
		</div>
	</div>
</div>
</body>
</html>