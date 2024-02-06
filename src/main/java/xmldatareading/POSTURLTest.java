package xmldatareading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class POSTURLTest {
	
	public static void main(String[] args) throws IOException {

	
	URL url = new URL ("https://reqres.in/api/users"); // POST API 
	
	HttpURLConnection con = (HttpURLConnection)url.openConnection();// Establishing a connection
	con.setRequestProperty("Content-Type", "application/json");
	con.setRequestProperty("Accept", "application/json");
	con.setDoOutput(true);
	String jsonInputString = "{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"leader\"\r\n"
			+ "}";
	try(OutputStream os = con.getOutputStream()) {
	    byte[] input = jsonInputString.getBytes("utf-8");
	    os.write(input, 0, input.length);		
	    // which is used for writing the byte array(that has been encoded into string using the default charset UTF-8
	    //into an output stream starting from 0th index till the complete byte array length).	
	}
	try(BufferedReader br = new BufferedReader(
			  new InputStreamReader(con.getInputStream(), "utf-8"))) {
			    StringBuilder response = new StringBuilder();
			    String responseLine = null;
			    while ((responseLine = br.readLine()) != null) {
			        response.append(responseLine.trim());
			        // triming all the leading and Trial spaces and appends it into the String Builder.
			    }
			    System.out.println(response.toString());
			}
	}
}