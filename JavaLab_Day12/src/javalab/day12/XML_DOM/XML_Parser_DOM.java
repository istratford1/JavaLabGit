package javalab.day12.XML_DOM;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XML_Parser_DOM {

	ArrayList<Employee> empArray = new ArrayList<Employee>();
	
	
	
	public ArrayList<Employee> getEmpArray() {
		return empArray;
	}


	// constructor	
	public XML_Parser_DOM(){
		
	
     		
		
	}
	

	public void parseEmployeesFromXML(String xmlFileName){
		
		// create factory class 
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			
				try {
					DocumentBuilder builder = factory.newDocumentBuilder();
					Document doc = builder.parse(xmlFileName);
					NodeList employeeList = doc.getElementsByTagName("employee");
				    for(int i = 0; i < employeeList.getLength(); i++){
				    	
				    	Employee oEmployee = new Employee();
				    	
				    	Node n = employeeList.item(i);
				    	if(n.getNodeType() == Node.ELEMENT_NODE){
				    	
				    		Element emp = (Element) n;
				    		oEmployee.setEmpID(Integer.parseInt(emp.getAttribute("id")));
				    	    NodeList nList = emp.getChildNodes(); // get child nodes underneath <employee.
				    	    for(int j =0; j<nList.getLength(); j++){
				    	       Node qNode = nList.item(j);
				    	       switch (qNode.getNodeName()){
				    	       		case "details" :
				    	       		  // get node that contain the detail we need
				    	       			NodeList qList = qNode.getChildNodes();
				    	       			for(int p = 0; p < qList.getLength(); p++){
				    	       			  Node pNode = qList.item(p);
				    	       			  switch(pNode.getNodeName()){
				    	       			    case "name":
				    	       			    	oEmployee.setName(pNode.getTextContent());
				    	       			    	break;
				    	       			   
				    	       			    case "salary" : 	
				    	       			    	oEmployee.setSalary(Integer.parseInt(pNode.getTextContent()));
				    	       			    	break;
				    	       			    
				    	       			    case "startDate" :	
				    	       			    	oEmployee.setStartDate(pNode.getTextContent());
				    	       			    	break;
				    	       			  }
				    	       				
				    	       			}
				    	       		
				    	       			break;
				    	       		case "deptCode"	:
				    	       		   // get node that contains the dept code
				    	       		    oEmployee.setDeptCode(qNode.getTextContent());
				    	       			
				    	       
				    	       			break;
				    	       }
				    	       
				    	       
				    	       
				    	       
				    	   
				    	     
				    	    	
				    	    }
				    	    
				    		
				    		
				    	}
				    	
				    	 empArray.add(oEmployee) ;  
				    	
				    }
				
				
			
				    
				
				} catch (ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		
		
		
		
		
	}
	
	
	

}
