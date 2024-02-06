package xmldatareading;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class ReadJSON<XmlMapper> {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		String path = "C:\\Users\\akilan-18633\\eclipse-workspace\\XMLDataReading\\target\\filedata.xml";
	
	
	File fXmlFile = new File(path);
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
    Document doc = dBuilder.parse(fXmlFile);
    System.out.println(doc.getElementsByTagName("method"));
    

	
}
}