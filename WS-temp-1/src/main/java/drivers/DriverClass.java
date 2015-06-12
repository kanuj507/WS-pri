package drivers;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;

import constant.ConstantClass;

public class DriverClass {
	
	
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
		

	}

}
