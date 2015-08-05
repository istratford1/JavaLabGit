package javalab.day12.XML_SAX;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class MySaxHandler extends DefaultHandler {

	 //List to hold Employees object
    private List<Employee> empList = null;
    private Employee emp = null;
 
 
    //getter method for employee list
    public List<Employee> getEmpList() {
        return empList;
    }
 
    // elements that we are interested in. use these as flags to read content 
    boolean bStartDate = false;
    boolean bName = false;
    boolean bSalary = false;
    boolean bDeptCode = false;
    boolean bDetails = false;
 
	
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)  throws SAXException {
    	
        if (qName.equalsIgnoreCase("employee")) {
            //create a new Employee and put it in Map
            String id = attributes.getValue("id");
            //initialize Employee object and set id attribute
            emp = new Employee();
            emp.setEmpID(Integer.parseInt(id));
            //initialize list
            if (empList == null)
                empList = new ArrayList<>();
      
        } else if (qName.equalsIgnoreCase("employees")) {
           ///
          
        
        } else if (qName.equalsIgnoreCase("details")) {
            bDetails = true;
                
        //set boolean values for fields, will be used in setting Employee variables
                
        } else if (qName.equalsIgnoreCase("name")) {
            bName = true;
        } else if (qName.equalsIgnoreCase("startDate")) {
            bStartDate = true;
        } else if (qName.equalsIgnoreCase("salary")) {
            bSalary = true;
        } else if (qName.equalsIgnoreCase("deptCode")) {
            bDeptCode = true;
        }
    }
 
 
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("Employee")) {
            // we can finish with  this object and add to list
            empList.add(emp);
        }
    }
 
 
    @Override
    public void characters(char ch[], int start, int length) throws SAXException {
        // have a look for which element is currently set and add the information to the relevent fields
        if (bStartDate) {
        	// for each item we need to parse the array of chars into a string to store in employee object
            emp.setStartDate(new String(ch, start, length));
            bStartDate = false;
        } else if (bName) {
            emp.setName(new String(ch, start, length));
            bName = false;
        } else if (bDeptCode) {
            emp.setDeptCode(new String(ch, start, length));
            bDeptCode = false;
        } else if (bSalary) {
            emp.setSalary(Integer.parseInt(new String(ch, start, length)));
            bSalary = false;
        }
    }

} 