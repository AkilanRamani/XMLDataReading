package xmldatareading;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class CharArray12 {
				 
			        // Creating an array of byte type chars and
			        // passing random  alphabet as an argument.abstract
			        // Say alphabet be 'w'
	public static String getCharacterEncoding()
    {
 
        // Creating an array of byte type chars and
        // passing random  alphabet as an argument.abstract
        // Say alphabet be 'w'
        byte[] byte_array = { 'w' };
       System.out.println (byte_array.toString());
 
        // Creating an object of InputStream
        ByteArrayInputStream instream
            = new ByteArrayInputStream(byte_array);
 
        // Now, opening new file input stream reader
        InputStreamReader streamreader
            = new InputStreamReader(instream);
        String defaultCharset = streamreader.getEncoding(); // Returns the name of the charset that is being used in this Stream
 
        // Returning default character encoding
        return defaultCharset;
    }
			    
			 
			    // Main driver method
			    public static void main(String args[])
			        throws FileNotFoundException,
			               UnsupportedEncodingException, IOException
			    {
			 
			        // Method returns a string of character encoding
			        // used by using System.getProperty()
			        String defaultencoding
			            = System.getProperty("file.encoding");
			 
			        System.out.println("Default Charset: "
			                           + defaultencoding);
			 
			        // Getting character encoding by InputStreamReader
			        System.out.println(
			            "Default Charset by InputStreamReader: "
			            + getCharacterEncoding());
			 
			        // Getting character encoding by java.nio.charset
			        System.out.println("Default Charset: "
			                           + Charset.defaultCharset()); //Returns the default charset of this Java virtual machine. 
			    }
			}
		
	