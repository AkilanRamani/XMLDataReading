package xmldatareading;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class JSONObjectSample {
	
	public static void main(String[] args) {
		
		JSONObject jo = new JSONObject(); 
        
        // putting data to JSONObject 
        jo.put("firstName", "John"); 
        jo.put("lastName", "Smith"); 
        jo.put("age", 25); 
        
       
        // for address data, first create LinkedHashMap 
        Map<String, Object> m = new LinkedHashMap<String, Object>(4); 
        
        m.put("streetAddress", "21 2nd Street"); 
        m.put("city", "New York"); 
        m.put("state", "NY"); 
        m.put("postalCode", 10021); 
          
        // putting address to JSONObject 
        jo.put("address", m); 
          
        // for phone numbers, first create JSONArray  
        JSONArray ja = new JSONArray(); 
          
        m = new LinkedHashMap(2); 
        m.put("type", "home"); 
        m.put("number", "212 555-1234"); 
          
        // adding map to list 
        ja.add(m); 
          
        m = new LinkedHashMap(2); 
        m.put("type", "fax"); 
        m.put("number", "212 555-1234"); 
          
        // adding map to list 
        ja.add(m); 
          
        // putting phoneNumbers to JSONObject 
        jo.put("phoneNumbers", ja); 
          
        // writing JSON to file:"JSONExample.json" in cwd 
        PrintWriter pw = null;
		try {
			pw = new PrintWriter("JSONExample.json");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        String jsonobject =   jo.toJSONString();
        pw.write(jsonobject);
        pw.flush(); 
        pw.close(); 
        
} 
	
      
    } 


	


