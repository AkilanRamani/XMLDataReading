package xmldatareading;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class SimpleJSON {

	public static void main(String[] args) {
		 String k = " {\r\n"
		 		+ "	\"Full Name\" : \"Ritu Sharma\",\r\n"
		 		+ "	\"Tuition Fees\" : 65400.0,\r\n"
		 		+ "	\"Roll No.\":1704310046\r\n"
		 		+ "}";
		            Object file = JSONValue.parse(k);
			        // In java JSONObject is used to create JSON object
			        JSONObject jsonObjectdecode = (JSONObject)file;
			 
			        // Converting into Java Data type
			        // format From Json is the step of Decoding.
			        String name
			            = (String)jsonObjectdecode.get("Full Name");
			        double fees
			            = (Double)jsonObjectdecode.get("Tuition Fees");
			        long rollno
			            = (Long)jsonObjectdecode.get("Roll No.");
			        System.out.println(name + " " + fees + " "
			                           + rollno);
			    }
			

	}


