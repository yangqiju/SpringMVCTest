<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<link rel="stylesheet" href="js/dojo/resources/dojo.css" />
	<link rel="stylesheet" href="js/dijit/themes/claro/claro.css" />
	<link rel="stylesheet" href="js/dojox/grid/enhanced/resources/claro/EnhancedGrid.css" />
	<link rel="stylesheet" href="js/dojox/grid/enhanced/resources/EnhancedGrid_rtl.css" />
	<style>
	#grid {
    width: 100em;
    height: 50em;
	}
	</style>
	<script type="text/javascript">
		require(["dojo/request","dojo/ready","dojox/grid/EnhancedGrid","dojo/data/ItemFileWriteStore","dojox/grid/enhanced/plugins/IndirectSelection"],
				function(request,ready,EnhancedGrid,ItemFileWriteStore,IndirectSelection){
			ready(function(){
				var showGrid = function(){
					  var data = {
					      identifier: 'id',
					      items: []
					    };
					    var data_list = [
					      { col1: "normal", col2: false, col3: 'But are not followed by two hexadecimal', col4: 29.91},
					      { col1: "important", col2: false, col3: 'Because a % sign always indicates', col4: 9.33},
					      { col1: "important", col2: false, col3: 'Signs can be selectively', col4: 19.34}
					    ];
					    var rows = 10;
					    for(var i=0, l=data_list.length; i<rows; i++){
					      data.items.push(dojo.mixin({ id: i+1 }, data_list[i%l]));
					    }
					    var store = new dojo.data.ItemFileWriteStore({data: data});

					    /*set up layout*/
					    var layout = [[
					      {name: '员工编号', field: 'col1'},
					      {name: '员工姓名', field: 'col2'},
					      {name: '部门', field: 'col3', width: "230px"},
					      {name: '上班时间', field: 'col4'},
					      {name: '下班时间', field: 'col4'},
					      {name: '迟到分钟数', field: 'col4'},
					      {name: '早退分钟数', field: 'col4'},
					      {name: '加班小时数', field: 'col4'},
					      {name: '是否旷工', field: 'col2'}
					    ]];

					    /* create a new grid:*/
					    var grid = new dojox.grid.EnhancedGrid({
					        id: 'grid',
					        store: store,
					        structure: layout,
					        rowSelector: '20px',
					        plugins: {indirectSelection: {headerSelector:true, width:"40px", styles:"text-align: center;"}}},
							document.createElement('div'));

					    /* append the new grid to the div*/
							dojo.byId("gridDiv").appendChild(grid.domNode);

					    /* Call startup() to render the grid*/
					    grid.startup();
				};
				var showData = function(data){
					alert(data);
					document.getElementById("gridDiv").innerHTML=data;
				}
			  request.get("http://localhost:8080/OA/showKQ/show.do", {
			    handleAs: "json"
			  }).then(function(data){
				  //showGrid();
				  showData(data);
			  }, function(err){
			    document.write("ERROR");
			  }, function(evt){
			    document.write("evt");
			  });
			});
		});
</script>
<body class="claro">
<div id="gridDiv"></div>
</body>
</html>
