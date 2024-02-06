package xmldatareading;

import java.io.File;



public class FileReader12 {
public static void main(String[] args) {
	// Create a file object 
	try {
    File f = new File(""); 

    // Get the absolute path of file f 
    String absolute = f.getAbsolutePath(); 
    System.out.println(absolute + File.separator + "/src/main/resources/abcd.txt");

    // Display the file path of the file object 
    // and also the file path of absolute file 
    System.out.println("Original  path: "
                       + f.getPath()); 
    System.out.println("Absolute  path: "
                       + absolute); 
} 
catch (Exception e) { 
    System.err.println(e.getMessage()); 
} 
} 
} 


	
