/**
 * 
 */

function simulateClick() {
		  var evt = document.createEvent("MouseEvents");
		  evt.initMouseEvent("click", true, true, window,
		    0, 0, 0, 0, 0, false, false, false, false, 0, null);
		  var a = document.getElementById("header"); 
		  a.dispatchEvent(evt);      
		}



public void clickLink(String IdValue)
{
	document.getElementById("header").click();
}


var fun1 = function(name) {
    print('Hi there from Javascript, ' + name);
    return "greetings from javascript";
};

var fun2 = function (object) {
    print("JS Class Definition: " + Object.prototype.toString.call(object));
};