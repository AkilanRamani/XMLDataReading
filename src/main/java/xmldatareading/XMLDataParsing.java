package xmldatareading;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLDataParsing {
	
  public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
	  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      
      Document document = builder.parse(".\\data\\employeedata.xml");
      
     Element root = document.getDocumentElement();
     NodeList nodeList = root.getChildNodes();
     for (int i = 0; i < nodeList.getLength(); i++) {
    	 
    	 Node node = nodeList.item(i);
    	  
         if (node.getNodeType() == Node.ELEMENT_NODE) {
              Element element = (Element) node;
              /*System.out.println(element); */
             String name = element.getTagName();
           String textnodes =  element.getTextContent();
           System.out.println("The Root node element tag name is" + name);
           System.out.println("The Root node element tag Content text is" + textnodes);
             System.out.println(textnodes);
      
              
     }
     
     
}
}
}