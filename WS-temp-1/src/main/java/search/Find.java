package search;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;

import constant.*;
public class Find {
	
	  String[] aryLines = {};   
	public void FindById(String IdValue)
	{
	//	String id=null;
		  String line = "";
		  System.out.println(line);
		  String inputSearch = "id="+ "\""+IdValue+"\"";
		  double count = 0,countBuffer=0,countLine=0;
		    String lineNumber = "";
		
		FileReader file_to_read;
		try {
			file_to_read = new FileReader(ConstantClass.FilePath);
			 BufferedReader buffer = new BufferedReader(file_to_read);
			 
		
		
		
		while((line = buffer.readLine()) != null)
        {
            countLine++;
            //System.out.println(line);
            String[] words = line.split(" ");

            for (String word : words) {
            	if( word.contains(inputSearch)){
            //  if (word.equals(inputSearch)) {
                count++;
                countBuffer++;
                System.out.println("Words :"+word);
              }
            }

            if(countBuffer > 0)
            {
                countBuffer = 0;
                lineNumber += countLine + ",";
            }

        }
		buffer.close();
	}
		catch(NoSuchElementException e)
		{
			e.printStackTrace();
		}
		 catch (FileNotFoundException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	System.out.println("Count : "+ count+"CountBuffer :"+countBuffer);
	if(count>0)
	{
		System.out.println("Successfully found "+IdValue+" Element" );
	}
	
	}
	
	public void FindByHref(String href)
	{
	//	String id=null;
		  String line = "";
		  System.out.println(line);
		  String inputSearch = "href="+ "\""+href+"\"";
		  double count = 0,countBuffer=0,countLine=0;
		    String lineNumber = "";
		
		FileReader file_to_read;
		try {
			file_to_read = new FileReader(ConstantClass.FilePath);
			 BufferedReader buffer = new BufferedReader(file_to_read);
			 
		
		
		
		while((line = buffer.readLine()) != null)
        {
            countLine++;
            //System.out.println(line);
            String[] words = line.split(" ");

            for (String word : words) {
            	if( word.contains(inputSearch)){
            //  if (word.equals(inputSearch)) {
                count++;
                countBuffer++;
                System.out.println("Words :"+word);
              }
            }

            if(countBuffer > 0)
            {
                countBuffer = 0;
                lineNumber += countLine + ",";
            }

        }
		buffer.close();
	}
		 catch (FileNotFoundException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	System.out.println("Count : "+ count+"CountBuffer :"+countBuffer);
	if(count>0)
	{
		System.out.println("Successfully found "+href+" Element" );
	}
	}
	
	
	public void FindByText(String text)
	{
	//	String id=null;
		  String line = "";
		  System.out.println(line);
		  String inputSearch = "id="+ "\""+text+"\"";
		  double count = 0,countBuffer=0,countLine=0;
		    String lineNumber = "";
		
		FileReader file_to_read;
		try {
			file_to_read = new FileReader(ConstantClass.FilePath);
			 BufferedReader buffer = new BufferedReader(file_to_read);
			 
		
		
		
		while((line = buffer.readLine()) != null)
        {
            countLine++;
            //System.out.println(line);
            String[] words = line.split(" ");

            for (String word : words) {
            	if( word.contains(inputSearch)){
            //  if (word.equals(inputSearch)) {
                count++;
                countBuffer++;
                System.out.println("Words :"+word);
              }
            }

            if(countBuffer > 0)
            {
                countBuffer = 0;
                lineNumber += countLine + ",";
            }

        }
		buffer.close();
	}
		catch(NoSuchElementException e)
		{
			e.printStackTrace();
		}
		 catch (FileNotFoundException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	System.out.println("Count : "+ count+"CountBuffer :"+countBuffer);
	if(count>0)
	{
		System.out.println("Successfully found "+text+" Element" );
	}
	
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		  final WebClient webClient = new WebClient();
		    final HtmlPage page = webClient.getPage("http://htmlunit.sourceforge.net");
		    assertEquals("HtmlUnit - Welcome to HtmlUnit", page.getTitleText());*/
			Find f=new Find();
			f.FindByHref("http://www.bestbuy.com/site/Global-Promotions/International+Orders/pcmcat176600050000.c?id=pcmcat176600050000");
	}
	
}
