package xmldatareading;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONSTRINGTOJSONOBJECT {

	public static void main(String[] args) {
		String string = "{\"name\": \"Sam Smith\", \"technology\": \"Python\"}";  
		JSONObject json = new JSONObject(string);  
		System.out.println(json.has("name"));
		Iterator<String> it = json.keys();
		String obj =(String)json.get("name");
		 if(obj instanceof Object ){ 
			 System.out.println("asd"); 
		 }
		while(it.hasNext()) {
			
			System.out.println(it.next());
		 
		}
		
		System.out.println(json.toString());  
		String technology = json.getString("technology");  
		System.out.println(technology);  
		}

}
	
	

