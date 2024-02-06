package xmldatareading;

import com.google.gson.Gson;

public class JsonToObject {
	public static void main(String[] args) {
	
	  Organisation org = new Organisation();
	  
      // Converting json to object
      org = getOrganisationObject();

      // Displaying object
      System.out.println(org);
  }

	private static Organisation getOrganisationObject()
    {
		String OrganisationJson = "{\r\n"
				+ "	\"organisation_name\" : \"GeeksforGeeks\",\r\n"
				+ "	\"description\" : \"A computer Science portal for Geeks\",\r\n"
				+ "	\"Employee\":\"2000\"\r\n"
				+ "}";
		
		Gson gson = new Gson();
		 
        // Converting json to object
        // first parameter should be preprocessed json
        // and second should be mapping class
		
		//Organisation org = gson.fromJson(OrganisationJson, Organisation.)
        Organisation organisation
            = gson.fromJson(OrganisationJson,
                            Organisation.class); // which will internally deserialize the JSON into an Class Object.
        System.out.println(organisation.toString());
        // return object
        return organisation;
        
    }

	}


