package actions;

public class Click {

	
	public void clickLink()
	{
		document.getElementById("gift-close").click();
	}
	
	function simulateClick() {
		  var evt = document.createEvent("MouseEvents");
		  evt.initMouseEvent("click", true, true, window,
		    0, 0, 0, 0, 0, false, false, false, false, 0, null);
		  var a = document.getElementById("gift-close"); 
		  a.dispatchEvent(evt);      
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}