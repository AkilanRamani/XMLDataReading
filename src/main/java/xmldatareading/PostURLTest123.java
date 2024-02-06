package xmldatareading;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class PostURLTest123 {

	public static void main(String[] args) throws IOException {
		 String urlParameters = "{\r\n"
		 		+ "    \"name\": \"morpheus\",\r\n"
		 		+ "    \"job\": \"leader\"\r\n"
		 		+ "}";
		    byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
		    int postDataLength = postData.length; // 15
		    String request = "https://reqres.in/api/users";
		    URL url = new URL(request);
		    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		    conn.setDoOutput(true);
		    conn.setInstanceFollowRedirects(false);
		    conn.setRequestMethod("POST");
		    conn.setRequestProperty("Content-Type", "application/json");
		    conn.setRequestProperty("charset", "utf-8");
		    conn.setRequestProperty("Content-Length", Integer.toString(postDataLength));
		    conn.setUseCaches(false);
		    try (DataOutputStream wr = new DataOutputStream(conn.getOutputStream())) {
		      wr.write(postData); // writing the post request data on to the data output stream.
		    }
		    int responseCode = conn.getResponseCode();
		    System.out.println("Response Code: " + responseCode);
		    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		    String inputLine;
		    StringBuffer response = new StringBuffer();
		    while ((inputLine = in.readLine()) != null) {
		      response.append(inputLine);
		    }
		    in.close();
		    System.out.println(response.toString());
		  }
		

	}


