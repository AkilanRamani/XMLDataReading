package xmldatareading;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputExample {

	public static void main(String[] args) throws IOException {
		 FileOutputStream file = new FileOutputStream("D:\\abc.txt");  
	        DataOutputStream data = new DataOutputStream(file);  
	        try {
				data.writeInt(65); 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
	        try {
				data.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
	        data.close();  
	        System.out.println("Succcess...");  
	    }  
	

	}


