package xmldatareading;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws IOException {
		{
	        URL urlObj = new URL("https://restcountries.com/v3.1/name/France");
	        HttpsURLConnection connection = (HttpsURLConnection) urlObj.openConnection();
	        connection.setRequestMethod("GET");

	        int responseCode = connection.getResponseCode();
	        //System.out.println("Response CODE: " + responseCode);

	        if (responseCode == HttpsURLConnection.HTTP_OK) {
	            StringBuilder sb = new StringBuilder();
	            Scanner scanner = new Scanner(connection.getInputStream());
	            while (scanner.hasNext()) {
	                sb.append(scanner.nextLine()); // which will read data from each line and append each line data into the String Buffer 
	            }
	            System.out.println(sb);
	            ObjectMapper objectMapper = new ObjectMapper();
	            List<Country> country = objectMapper.readValue(String.valueOf(sb), new TypeReference<List<Country>>() {});
	            System.out.println(country);

	        } else {
	            System.out.println("Error in sending a GET request");
	        }
	    }
	

	

}
}
