package xmldatareading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class TextReading {

	public static void main(String[] args) throws IOException {
		  URL url = null;
		try {
			url = new URL("https://reqres.in/api/users/2");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          InputStream inputstream =  url.openStream();
          InputStreamReader reader = new InputStreamReader(inputstream);
          //which will translate/decode the byte array(that is in Encoded Form) into an character Oriented data (readable Format).
		 //Every sequence of charcaters will have binary encoding value and therefore charset (UTF-8) can be used to decode the binary value into the charcater.
          BufferedReader in = new BufferedReader(reader);
		  String str;
		    while ((str = in.readLine()) != null) {
		      System.out.println(str); 
		    }
		    in.close();
		  }
		

	}


