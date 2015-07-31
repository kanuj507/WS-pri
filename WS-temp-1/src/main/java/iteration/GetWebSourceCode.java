package iteration;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import constant.*;
public class GetWebSourceCode {


public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
	
	//String weburl="https://en.wikipedia.org/wiki/Main_Page";
	String weburl="http://www.bestbuy.com";
	
	// Make a URL to the web page
    URL url = new URL(weburl);

    // Get the input stream through URL Connection
    URLConnection con = url.openConnection();
    java.io.InputStream is = con.getInputStream();

    // Once you have the Input Stream, it's just plain old Java IO stuff.

    // For this case, since you are interested in getting plain-text web page
    // I'll use a reader and output the text content to System.out.

    // For binary content, it's better to directly read the bytes from stream and write
    // to the target file.


    BufferedReader br = new BufferedReader(new InputStreamReader(is));

    String line = null;
    // write output to file
     PrintStream console = System.out;

  	File file = new File(ConstantClass.FilePath);
  	
  	/*if (!file.exists()) {
		file.createNewFile();
	}*/
  	FileOutputStream fos = new FileOutputStream(file);
  	PrintStream ps = new PrintStream(fos);
  	System.setOut(ps);
  	
    // read each line and write to System.out
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    
        }

    System.setOut(console);

    System.out.println("Code is successfully copied to file");
}
}
