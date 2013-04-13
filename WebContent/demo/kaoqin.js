define("demos/fisheye/src",
["dojo","dijit","dojox","dojo/require!dojox/layout/ContentPane"],
function(_1,_2,_3){
	var showKQ = function() {
		alert(dijit.byId("kaoqin"));
		//alert(dijit.byId("mainShowContainer"));
		var mainShowContainer = dijit.byId("mainShowContainer");
		var cp2 = new _3({
					title: "Drinks",
					content:"Hellworld",
					closable:true,
					onClose:function() {
						return confirm("Are you sure you want to close me???");
					}
				  });
		mainShowContainer.addChild(cp2);
		mainShowContainer.selectChild(cp2);
	}
}
);
