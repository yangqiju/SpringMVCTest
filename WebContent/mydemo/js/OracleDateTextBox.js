require([ "dojo/ready", "dojo/_base/declare", "dijit/form/DateTextBox",
		"dojo/date/locale", "dojo/dom" ], function(ready, declare, DateTextBox,
		locale, dom) {
	return declare("OracleDateTextBox", DateTextBox, {
		oracleFormat : {
			selector : 'date',
			datePattern : 'dd-MMM-yyyy',
			locale : 'en-us'
		},
		value : "", // prevent parser from trying to convert to Date object
		postMixInProperties : function() { // change value string to Date
											// object
			this.inherited(arguments);
			// convert value to Date object
			this.value = locale.parse(this.value, this.oracleFormat);
		},
		// To write back to the server in Oracle format, override the serialize
		// method:
		serialize : function(dateObject, options) {
			return locale.format(dateObject, this.oracleFormat).toUpperCase();
		}
	});
});
