package xmldatareading;

import org.json.JSONObject;

public class JSONObject12 {

	public static void main(String[] args) {
		JSONObject file = new JSONObject();
		
		 
        file.put("Full Name", "Ritu Sharma");
        file.put("Roll No.", new Integer(1704310046));
        file.put("Tuition Fees", new Double(65400));
 
        // To print in JSON format.
        System.out.print(file);

	}

}
