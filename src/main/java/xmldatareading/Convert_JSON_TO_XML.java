package xmldatareading;

import org.json.JSONObject;
import org.json.XML;

public class Convert_JSON_TO_XML {
	
	 public String convert_json(String json_value) {
	        String xml = "";
	        try {
	            JSONObject jsoObject = new JSONObject(json_value);
	            xml = xml + XML.toString(jsoObject);
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	        xml = xml + "";
	        return xml;
	    }

}
