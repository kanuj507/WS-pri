package constant;

import java.io.IOException;
import java.util.NoSuchElementException;

public class ConstantClass {

	public final static String URL="https://www.google.com"; 
	
	public void chromeDriver()
	{
		try {
			try {
				Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome "+URL});
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Runtime.getRuntime().exec(new String[] { "Chrome", URL });
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void ieDriver()
	{
		try {
			Runtime.getRuntime().exec(new String[] { "cmd", "/c","start IEXPLORE.EXE "+URL});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void firefoxDriver()
	{
		try {
			Runtime.getRuntime().exec(new String[] { "cmd", "/c","start firefox "+URL});
		} 
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	/*public static final String OPEN_URL = "OpenURL";

	public static final String SET_TEXT = "setText";

	public static final String CLICK = "click";

	public static final String SKIP_CERTIFICATE = "skipCertificateError";

	public static final String AUTHENTICATE = "Authenticate";

	public static final String SWITCH_FRAME_BY_INDEX = "SwitchToFrameByIndex";
	public static final String SWITCH_FRAME_BY_NAME = "SwitchToFrameByName";
	public static final String SWITCH_FRAME_BY_ELEMENT = "SwitchToFrameByElement";

	public static final String FIND_AND_PROCEED_REQ_ID = "FindAndProceedRequestID";
	public static final String ENTER_AND_CLICK_RESOURCE_FOUND = "EnterAndClickResourceFound";
	public static final String VALIDATE_AND_PROCEED_SUPERVISOR = "ValidateProceedSupervisor";

	// flags used to control the flow
	public static final boolean CF_PENDING = true;
	public static final boolean DR_PENDING = true;

	// default time wich controls the wait time of webelement finder
	public static final int DEFAULT_TIME = 10;

	// other constants used internally
	public static final String ID = "id";
	public static final String NAME = "name";
	public static final String LINK_TEXT = "prtial_link_text";
	public static final String XPATH = "xpath";
	public static final String CLASS_NAME = "className";*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstantClass CC= new ConstantClass();
		CC.firefoxDriver();

	}

}
