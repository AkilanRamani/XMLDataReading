package xmldatareading;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamData {

	public static void main(String[] args) {
		  try  {  
	            FileInputStream stream = new FileInputStream("xyz.txt");  
	            try (Reader reader = new InputStreamReader(stream)) {
					int data = reader.read();  
					while (data != -1) { //-1=! -1 (false condition).  
					    System.out.print((char) data);  
					    data = reader.read();  // -1 
					}
				}  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	    }  
	

	}


