package xmldatareading;

import java.io.IOException;
import java.io.StringWriter;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;



public class JSONDataGenerator {

	public static void main(String[] args) throws IOException {
		  JsonFactory factory = new JsonFactory(); // creating an object of JSONFactory which is Responsible For creation/ Generating the JSON Data. 
	      StringWriter jsonObjectWriter = new StringWriter(); // StringWriter is Responsible For Writing the data on the Console by reading the data From an External File (Txt Files) etc
	     // Method for constructing JSON generator for writing JSON contentusing specified Writer. 
	      JsonGenerator generator = factory.createGenerator(jsonObjectWriter); // Method which is responsible for generating a JSON Content and Printing on the console using the writer(StringWriter)
	      generator.useDefaultPrettyPrinter(); // pretty print JSON
	      generator.writeStartObject();
	      generator.writeFieldName("empid");
	      generator.writeString("120");
	      generator.writeFieldName("firstName");
	      generator.writeString("Ravi");
	      generator.writeFieldName("lastName");
	      generator.writeString("Chandra");
	      generator.writeFieldName("technologies");
	      generator.writeStartArray();
	      generator.writeString("SAP");
	      generator.writeString("Java");
	      generator.writeString("Selenium");
	      generator.writeEndArray();
	      generator.writeEndObject();
	      generator.close(); // to close the generator
	      System.out.println(jsonObjectWriter.toString());
	   }
	
	}


