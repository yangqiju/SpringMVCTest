define(["dojo/_base/declare", "dojo/ready", "dojo/_base/window", "dojo/store/Memory",
		"dijit/tree/ObjectStoreModel", "dijit/Tree" ], function(declare, win,
		Memory, ObjectStoreModel, Tree) {
	// Create test store, adding the getChildren() method required by
	// ObjectStoreModel

	return declare("MyTree",Tree, {
		url:'url',
		getUrl:function(){
			return this.url;
		},
		constructor:function(){
			//var myStore = new Memory();
			var myModel = new ObjectStoreModel({
				//store : myStore,
				//query : {
				//	id : 'world'
				//}
			});
			this.Model =  myModel;
		}
	});

});