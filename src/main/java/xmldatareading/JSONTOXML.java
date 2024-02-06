package xmldatareading;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;



public class JSONTOXML {

	public static void main(String[] args) 
	        throws IOException, URISyntaxException 
	    { 
	        String uribase = "https://www.geeksforgeeks.org/java-nio-file-paths-class-in-java/"; 
	        // Constructor to create a new URI 
	        // by parsing the string 
	        URI uri = new URI(uribase); 
	  
	        // create object of Path 
	      Path path = (Path)Paths.get(uri);
	        //Path path = (Path)Paths.get(uri); 
	  
	        // print ParentPath 
	        System.out.println(path); 
	        
	    
	                // create object of Path 
	                Path path1 = (Path)Paths.get("/usr", "local", "bin"); 
	          
	                // print Path 
	                System.out.println(path1); 
	               
	            } 
	       
	    } 
	


	


