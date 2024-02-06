package xmldatareading;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class ObjectToJson {

	public static void main(String[] args) {
		  Organisation org = new Organisation();
	       
	      /*  ObjectMapper Obj = new ObjectMapper();
	        try {
	 
	            String jsonStr = Obj.writeValueAsString(org);
	 
	            System.out.println(jsonStr);
	        }
	        catch (IOException e) {
	 
	            e.printStackTrace();
	        }
	    }
	    public static Organisation getObjectData(Organisation org)
	    {
	 
	        org.setOrganisation_name("GeeksforGeeks");
	        org.setDescription(
	            "A computer Science portal for Geeks");
	        org.setEmployees(2000);
	        return org;
	    }

	} */
	        
		  org = getObjectData(org); // which will Return an Object with all the instances Fully initialized.
		  
	        System.out.println("Json representation"
	                           + " of Object organisation is ");
	        // In the below line
	        // we have created a New Gson Object
	        // and call it's toJson inbuilt function
	        // and passes the object of organisation
	        
	        Gson gson = new Gson();
	        gson.toJson(org); // 
	        System.out.println(new Gson().toJson(org));
	    }
	 
	    /** Get the data to be inserted into the object **/
	    public static Organisation getObjectData(Organisation org)
	    {
	 
	        /**insert the data**/
	        org.setOrganisation_name("GeeksforGeeks");
	        org.setDescription("A computer Science portal for Geeks");
	        org.setEmployees(2000);
	 
	        /**Return Object**/
	        return org;
	    }
	}

