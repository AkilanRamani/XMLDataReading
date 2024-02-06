package xmldatareading;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

public class TestByteArray {

	public static void main(String[] args) {
		try
		{
			//char[] arr = new char[512];  
			StringWriter writer = new StringWriter();  
			FileInputStream input = new FileInputStream("C:\\AKILAN\\abc.txt");    
			BufferedReader buffer =  new BufferedReader(new InputStreamReader(input)); 
		   // System.out.println(input.available()); 
			int c; 
			while ((c=buffer.read())!=-1) {  
				writer.write(c);  
			}  
			System.out.println(writer.toString());  
			//System.out.println(writer);  
			writer.close();  
			buffer.close();  
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.toString());
		}
	}
	}

