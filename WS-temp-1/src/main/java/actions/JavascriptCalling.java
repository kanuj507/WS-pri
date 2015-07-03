package actions;
import java.net.URL;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.script.*;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
//import org.w3c.dom.Document;

public class JavascriptCalling {

	public static final String MY_JS1
    = "print(\"Hello world!\\n\");"
    + "var myFunction = function(x) { return x+3; };";
	
	public static String header ="lst-ib";
	public static final String MY_JS="document.getElementById("+header+").click();";
	
	
	
	/*
	public void abc(){
		  try {

		        URL url = new URL("http://74.127.61.106/udayavaniIpad/details_android.php?home=1&catid=882&newsid=27593");
		        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		        DocumentBuilder db = dbf.newDocumentBuilder();
		        Document doc = (Document) db.parse(new InputSource(url.openStream()));
		        ((Node) doc.getDefaultRootElement()).normalize();
		        doc.getElementById();
		        
		        doc.
		        
		        NodeList nodeList = ((org.w3c.dom.Document) doc).getElementsByTagName("item");
		        doc.getElementById("item");

		        *//** Assign textview array lenght by arraylist size *//*
		        name = new TextView[nodeList.getLength()];
		        website = new TextView[nodeList.getLength()];
		        category = new TextView[nodeList.getLength()];

		        for (int i = 0; i < nodeList.getLength(); i++) {

		            Node node = nodeList.item(i);

		            name[i] = new TextView(this);

		            Element fstElmnt = (Element) node;
		            fstElmnt.
		            NodeList nameList = fstElmnt.getElementsByTagName("hiddenDivHL");
		            Element nameElement = (Element) nameList.item(0);
		            nameList = nameElement.getChildNodes();
		            name[i].setText("Name = "
		                    + ((Node) nameList.item(0)).getNodeValue());


		            layout.addView(name[i]);



		        }
		    } catch (Exception e) {
		        System.out.println("XML Pasing Excpetion = " + e);
		    }

		    *//** Set the layout view to display *//*
		    setContentView(layout);

		}
	}
	*/
	

public static void main(String[] args)
        throws ScriptException, NoSuchMethodException {

	
	
	
	

   
    // Retrieving the Javascript engine
    ScriptEngine se = new ScriptEngineManager()
        .getEngineByName("javascript");

    if ( Compilable.class.isAssignableFrom(se.getClass()) ) {

        // We can compile our JS code
        Compilable c = (Compilable) se;
        CompiledScript cs = c.compile(MY_JS);

        System.out.println("From compiled JS:");
        cs.eval();

    } else {

        // We can't compile our JS code
        System.out.println("From interpreted JS:");
        se.eval(MY_JS);

    }

    // Can we invoke myFunction()?
   /* if ( Invocable.class.isAssignableFrom(se.getClass()) ) {

        Invocable i = (Invocable) se;
        System.out.println("myFunction(2) returns: "
            + i.invokeFunction("myFunction", 2));

    } else {

        System.out.println(
            "Method invocation not supported!");

    }
*/
}
}
