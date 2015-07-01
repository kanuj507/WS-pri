package actions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

import javax.script.*;
public class Click {

	
	public static void main(String[] args) throws NoSuchMethodException {
		
		  try {
	            ScriptEngineManager manager = new ScriptEngineManager();
	            ScriptEngine javascriptEngine = manager.getEngineByExtension("js");
	             
	            // Get script from JS File
	            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\anuj.pachauri\\Documents\\GitHub\\WS-pri\\WS-temp-1\\src\\main\\java\\actions\\Actions.js");
	            if (fileInputStream != null) {
	                BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
	         
	                javascriptEngine.eval(reader);
	                Invocable invocableEngine = (Invocable)javascriptEngine;
	                 
	                // Invoke javascript function named "sayHello" with parameter "Atul"
	                Object object = invocableEngine.invokeFunction("sayHello", new String[]{"Atul"});
	                Object object1 = invocableEngine.invokeFunction("fun1", new String[]{"ABC"});
	           //     Object object2 = invocableEngine.invokeFunction("clickLink", new String[]{"lst-ib"});
	                System.out.println("Result: " + object);
	                System.out.println("Result: " + object1);
	             //   System.out.println("Result: " + object2);
	            }
	        }
	        catch (Exception ex) {
	            ex.printStackTrace();
	        }
		
		// TODO Auto-generated method stub
		/*ScriptEngineManager factory = new ScriptEngineManager();
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
		}*/

	}
	

}
