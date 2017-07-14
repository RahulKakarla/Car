package Logger;

import java.io.File;
import java.io.IOException;

import javax.sql.rowset.spi.XmlReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLReader {
	private static final Logger log=LogManager.getLogger(XmlReader.class); 
	public static void main(String[] args) {
		try {	
			log.debug("Execute main method");
		    File xmlfile=new File("car.xml");
		    DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
			DocumentBuilder dba=dbf.newDocumentBuilder();
			Document doc=dba.parse(xmlfile);
			
			doc.getDocumentElement().normalize();
			System.out.println(doc.getDocumentElement().getNodeName());		
			NodeList ls = doc.getElementsByTagName("car");
			
			for(int i=0;i<ls.getLength();i++){
				Node nd=ls.item(i);
				System.out.println(nd.getNodeName());
				if(nd.getNodeType()==Node.ELEMENT_NODE){
					Element elm = (Element) nd;
					log.debug("id:"+elm.getAttribute("id"));
					log.error("Make:"+elm.getElementsByTagName("make").item(0).getTextContent());
					log.warn("Model:"+elm.getElementsByTagName("model").item(0).getTextContent());
					
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
