package xmldatareading;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class JSONWriteExample {

	public static void main(String[] args) throws FileNotFoundException {
		 
             //Data to write on Console using PrintWriter  
		PrintStream stream = System.out; // the output stream which displays an output to the console.
       PrintWriter writer = new PrintWriter(stream) ;
       
       //this.stream = stream; 
      writer.write("Javatpoint provides tutorials of all technology.");        
 writer.flush();  
      writer.close();  
//Data to write in File using PrintWriter       
      PrintWriter writer1 =null;      
         writer1 = new PrintWriter(new File("D:\\a88c.txt"));  
         writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");                                                   
                         writer1.flush();  
         writer1.close();  
    }  


	}

