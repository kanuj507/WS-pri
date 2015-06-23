package drivers;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.NoSuchElementException;

import javax.swing.JOptionPane;

import constant.ConstantClass;

public class DriverClass {
	
	// Load the URL in mentioned browser
	public void loadUrl(String browser,String URL)
	{
		String errtext="Not able to locate the browser";
		if(browser.equalsIgnoreCase("chrome"))
		{try {
			Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome "+URL});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		else if(browser.equalsIgnoreCase("ie"))
		{
			try {
				Runtime.getRuntime().exec(new String[] { "cmd", "/c","start IEXPLORE.EXE "+URL});
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			try {
				Runtime.getRuntime().exec(new String[] { "cmd", "/c","start firefox "+URL});
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(errtext+"e.printStackTrace()");
			} 
		}
		else
		{
			System.out.println("Not able to Locate the browser.");
			
		}
	}
	
	// load URL in default browser
	public void loadUrl(String URL)
	{
		// Create Desktop object
				 Desktop d=Desktop.getDesktop();
				 java.net.URI u = null;
				try {
					u = new java.net.URI(URL);
				} catch (URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				 // Browse a URL, say google.com
				 try {
					d.browse(u);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DriverClass DC=new DriverClass();
		DC.loadUrl(ConstantClass.URL);
	//	DC.loadUrl("chrome", "https://portal.accenture.com");

		final String errMsg = "Error attempting to launch web browser";
		String osName = System.getProperty("os.name"); 
		try{ 
		    if (osName.startsWith("Windows")) 
		        Runtime.getRuntime().exec( "rundll32 url.dll,FileProtocolHandler " + "www.google.com");
		}catch(Exception e){
		    JOptionPane.showMessageDialog(null, errMsg + "\n" + e.toString());
		}
		/*ConstantClass CC=new ConstantClass();
		CC.chromeDriver();*/
		
		/*DriverClass DC=new DriverClass();
		DC.loadUrl(ConstantClass.URL);*/
		

	}

}
