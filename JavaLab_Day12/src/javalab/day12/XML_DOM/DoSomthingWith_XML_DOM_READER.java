package javalab.day12.XML_DOM;

import javalab.day12.shared.Employee;

public class DoSomthingWith_XML_DOM_READER {

	
	public static void main(String[] args){
		
		XML_Parser_DOM MyXMLParser = new XML_Parser_DOM();
		MyXMLParser.parseEmployeesFromXML("employees.xml");
		
		
		 for(Employee e: MyXMLParser.getEmpArray()){
			 
			 System.out.println(e.toString());
			 
		 }
		    
		
		
		
		
		
	}
}
