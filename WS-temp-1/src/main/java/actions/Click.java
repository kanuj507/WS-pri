package actions;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.*;
public class Click {

	//public static final String MY_JS
    //= "print(\"Hello world!\\n\");"
    //+ "var myFunction = function(x) { return x+3; };";
	
	
	public static String header ;
	public static final String MY_JS="document.getElementById("+header+").click();";
public void clickLink(String IdValue)
{
	// document.getElementById("header").click();
}

	
	public static void main(String[] args) throws NoSuchMethodException {
		// TODO Auto-generated method stub
		ScriptEngineManager factory = new ScriptEngineManager();
		 // create a JavaScript engine
		 ScriptEngine engine = factory.getEngineByName("JavaScript");
		 // evaluate JavaScript code from String
		 try {
			//engine.eval(new java.io.FileReader("Actions.js"));
			
			engine.eval(new FileReader("Actions.js"));

			Invocable invocable = (Invocable) engine;

			Object result = invocable.invokeFunction("fun1", "Peter Parker");
			System.out.println(result);
			System.out.println(result.getClass());
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
