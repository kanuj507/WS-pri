import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


public class Try {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
	Robot r = new Robot();
	
	r.mousePress(InputEvent.BUTTON1_MASK);
	r.mouseMove(InputEvent.BUTTON1_MASK, InputEvent.BUTTON2_DOWN_MASK);
	r.mouseRelease(InputEvent.BUTTON3_MASK);
} catch (AWTException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//r.mouseMove(arg0, arg1);

	
	}*/
	
	public void Try()
	{
	       URL url;
		try {
			url = new URL("http://74.127.61.106/udayavaniIpad/details_android.php?home=1&catid=882&newsid=27593");
		      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		        DocumentBuilder db = dbf.newDocumentBuilder();
		        Document doc = (Document) db.parse(new InputSource(url.openStream()));
		        ((Node) doc.getDefaultRootElement()).normalize();
		        		              
		        Element nodeList =     ((org.w3c.dom.Document) doc).getElementById("item");
		     //   doc.
		        
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	}
	public static String get(String url) throws Exception {
		   StringBuilder sb = new StringBuilder();
		   for(Scanner sc = new Scanner(new URL(url).openStream()); sc.hasNext(); )
		      sb.append(sc.nextLine()).append('\n');
		   return sb.toString();
		}
		
	  public static void main(String[] args) throws Exception
	  {	   System.out.println(get("http://www.yahoo.com"));
		  
		  
		  
		  
		  
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		    //get current date time with Date()
		    Date date = new Date(0);
		    System.out.println(dateFormat.format(date));
		    Calendar javaCalendar = null;
		    String currentDate = "";

		   javaCalendar = Calendar.getInstance();

		   currentDate = "0"+(javaCalendar.get(Calendar.MONTH) + 1)+ "/0" + (javaCalendar.get(Calendar.DATE) +1) + "/" + javaCalendar.get(Calendar.YEAR);
			System.out.println(currentDate);
			String lockDate=currentDate+1;
			System.out.println(lockDate);
			
			
			
		  Robot robot =new Robot();
		  robot.setAutoDelay(40);
		    robot.setAutoWaitForIdle(true);
		     
		    robot.delay(4000);
		    robot.mouseMove(40, 130);
		    robot.delay(500);
		 
		    leftClick();
		    robot.delay(500);
		    leftClick();
		 
		    robot.delay(500);
		    type("Hello, world");
		 
		    robot.mouseMove(40, 160);
		    robot.delay(500);
		 
		    leftClick();
		    robot.delay(500);
		    leftClick();
		     
		    robot.delay(500);
		    type("This is a test of the Java Robot class");
		     
		    robot.delay(50);
		    type(KeyEvent.VK_DOWN);
		     
		    robot.delay(250);
		    type("Four score and seven years ago, our fathers ...");
		 
		    robot.delay(1000);
		    System.exit(0);
	  }
	   
	 
	   
	  private static void leftClick()
	  {
		  Robot robot;
			try {
				robot = new Robot();
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.delay(200);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    robot.delay(200);
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   
	  }
	   
	  private static void type(int i)
	  {
			Robot robot;
			try {
				robot = new Robot();
				 robot.delay(40);
				    robot.keyPress(i);
				    robot.keyRelease(i);
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   
	  }
	 
	  private static void type(String s)
	  {
		   
		try {
			Robot	robot = new Robot();
		    byte[] bytes = s.getBytes();
		    for (byte b : bytes)
		    {
		      int code = b;
		      // keycode only handles [A-Z] (which is ASCII decimal [65-90])
		      if (code > 96 && code < 123) code = code - 32;
		      robot.delay(40);
		      robot.keyPress(code);
		      robot.keyRelease(code);
		    }
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	  }
	  
	  
	  

}
