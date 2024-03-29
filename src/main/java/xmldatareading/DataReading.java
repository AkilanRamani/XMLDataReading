package xmldatareading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DataReading {

	
	private static final String USER_AGENT = "PostmanRuntime/7.35.0";

    private static final String GET_URL = "https://reqres.in/api/users/2";
	public static void main(String[] args) throws IOException {
		
	    
	        sendHttpGETRequest();
	    }

	    private static void sendHttpGETRequest() throws IOException {
	        URL obj = new URL(GET_URL);
	        HttpURLConnection httpURLConnection = (HttpURLConnection) obj.openConnection();
	        httpURLConnection.setRequestMethod("GET");
	        httpURLConnection.setRequestProperty("User-Agent", USER_AGENT);
	        int responseCode = httpURLConnection.getResponseCode();
	        System.out.println("GET Response Code :: " + responseCode);
	        if (responseCode == HttpURLConnection.HTTP_OK) { // success 200==200 (true condition)
	        InputStream stream = httpURLConnection.getInputStream(); 
	        InputStreamReader reader = new InputStreamReader(stream);
	        BufferedReader in = new BufferedReader(reader);
	        String inputLine;
	        StringBuffer response = new StringBuffer();

	            while ((inputLine = in .readLine()) != null) {
	                response.append(inputLine);
	            } in .close();

	            // print result
	            System.out.println(response.toString());
	        } else {
	            System.out.println("GET request not worked");
	        }

	        for (int i = 1; i <= 8; i++) {
	            System.out.println(httpURLConnection.getHeaderFieldKey(i) + " = " + httpURLConnection.getHeaderField(i));
	        }

	    }
	

	}


