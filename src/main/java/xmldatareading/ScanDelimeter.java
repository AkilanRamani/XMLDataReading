package xmldatareading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanDelimeter {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f = new File(".//XMLDataReading/data/abc.txt");
		   Scanner scan = new Scanner(f);  
           //Initialize the string delimiter  
           scan.useDelimiter("/");  
           //Printing the tokenized Strings  
           while(scan.hasNext()){  
               System.out.println(scan.next());  
           }  
           scan.close();   
         }    


	}


