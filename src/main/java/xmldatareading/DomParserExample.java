package xmldatareading;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import xmldatareading.Employee;

public class DomParserExample {

	
	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		//Get Document Builder
		 List<Employee> employees = new ArrayList<Employee>();
		 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	        try {
	            DocumentBuilder builder = factory.newDocumentBuilder();

	            // Get Document
	            
	            Document document = builder.parse(new File(".\\data\\employeedata.xml"));

	            // Normalize the xml structure
	            document.getDocumentElement().normalize();
	           

	            // Get all the element by the tag name

	            NodeList laptopList = document.getElementsByTagName("Employee");
	            for(int i = 0; i <laptopList.getLength(); i++) {
	                Node laptop = laptopList.item(i);
	                if(laptop.getNodeType() == Node.ELEMENT_NODE) {

	                    Element laptopElement = (Element) laptop;
	                    System.out.println("First Name: " + laptopElement.getAttribute("ID"));

	                    NodeList laptopDetails =  laptop.getChildNodes();
	                    for(int j = 0; j < laptopDetails.getLength(); j++){
	                        Node detail = laptopDetails.item(j);
	                        if(detail.getNodeType() == Node.ELEMENT_NODE) {
	                            Element detailElement = (Element) detail;
	                            System.out.println("     " + detailElement.getTagName() + ": " + detailElement.getTextContent());
	                        }

	                    }

	                }
	            }


	        } catch (ParserConfigurationException e) {
	            e.printStackTrace();
	        } catch (SAXException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	
	
	


	for (Employee empl: employees) {
        System.out.println(empl.toString());
	    }
}
}
