//>>built
define("demos/fisheye/src",
["dojo","dijit","dojox","dojo/require!dojox/widget/FisheyeList,dojo/parser"],
function(_1,_2,_3){
	_1.require("dojox.widget.FisheyeList");
	_1.require("dojo.parser");
	_1.addOnLoad(function(){_1.parser.parse();});
	function _4(id){alert("icon "+id+" was clicked");};
}
);
