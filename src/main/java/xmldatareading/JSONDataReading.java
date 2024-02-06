package xmldatareading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONDataReading {

	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
		
		String stream = "JSONExample.json";
		JSONParser parser = new JSONParser();
		FileReader read = new FileReader(stream);
		Object obj = parser.parse(read);
		//Object obj = parser.parse(new FileReader(stream));
        
        // typecasting obj to JSONObject 
        JSONObject jo = (JSONObject) obj; 
          
        // getting firstName and lastName 
        String firstName = (String) jo.get("firstName"); 
        String lastName = (String) jo.get("lastName"); 
          
        System.out.println(firstName); 
        System.out.println(lastName); 
          
        // getting age 
        long age = (long) jo.get("age"); 
        System.out.println(age); 
          
        // getting address 
        Map<?, ?> address = ((Map)jo.get("address")); 
          
        // iterating address Map 
        Iterator<?> itr1 = address.entrySet().iterator(); 
        while (itr1.hasNext()) { 
            Map.Entry pair = (Entry) itr1.next(); 
            System.out.println(pair.getKey() + " : " + pair.getValue()); 
        } 
          
        // getting phoneNumbers 
        JSONArray ja = (JSONArray) jo.get("phoneNumbers"); 
          
        // iterating phoneNumbers 
        Iterator itr2 = ja.iterator(); 
          
        while (itr2.hasNext())  
        { 
            itr1 = ((Map) itr2.next()).entrySet().iterator(); 
            while (itr1.hasNext()) { 
                Map.Entry pair = (Entry) itr1.next(); 
                System.out.println(pair.getKey() + " : " + pair.getValue()); 
            } 
        } 
    } 


	}

