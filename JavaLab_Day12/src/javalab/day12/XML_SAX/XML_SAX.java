package javalab.day12.XML_SAX;

import java.io.File;
import java.io.IOException;
import java.util.List;
 
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
 
import org.xml.sax.SAXException;
 
 
public class XML_SAX {
 
    public static void main(String[] args) {
    SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
    try {
        SAXParser saxParser = saxParserFactory.newSAXParser();
        
        MySaxHandler handler = new MySaxHandler();
        
        // parse the file into the handler object
        saxParser.parse(new File("employees.xml"), handler);
        
        //return employee list that was created in the handler
        
        List<Employee> empList = handler.getEmpList();
        
        
        for(Employee emp : empList){
        	System.out.println(emp);
            
        }
            
        
    } catch (ParserConfigurationException | SAXException | IOException e) {
        e.printStackTrace();
    }
    }
 



}
