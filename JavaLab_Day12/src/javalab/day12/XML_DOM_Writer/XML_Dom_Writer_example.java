package javalab.day12.XML_DOM_Writer;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import javalab.day12.XML_DOM.XML_Parser_DOM;
import javalab.day12.shared.Employee;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XML_Dom_Writer_example {

	
		public static void main(String argv[]) {

		  try {

			  
			// lets create some employees by parsing them from an existing file...
			
			XML_Parser_DOM MyEmployeeDOMReader = new XML_Parser_DOM();
			
			MyEmployeeDOMReader.parseEmployeesFromXML("employees.xml");
			
			
			// now lets create the DOM builder for the output XML file
			  
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			
			
			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("employees");
			doc.appendChild(rootElement);

			
			for(Employee e: MyEmployeeDOMReader.getEmpArray()){
				
				// each employee has an ID attribute
				Element employee = doc.createElement("employee");
				Attr attr = doc.createAttribute("id");
				attr.setValue(String.valueOf(e.getEmpID()));
				employee.setAttributeNode(attr);
				rootElement.appendChild(employee);

				
			

				///
				// each employee has details
				Element details = doc.createElement("details");
				employee.appendChild(details);

				
				
					// name elements
					Element name = doc.createElement("name");
					name.appendChild(doc.createTextNode(e.getName()));
					details.appendChild(name);
	
					// salary elements
					Element salary = doc.createElement("salary");
					salary.appendChild(doc.createTextNode(String.valueOf(e.getSalary())));
					details.appendChild(salary);

					
					// date started elements
					Element startDate = doc.createElement("startDate");
					startDate.appendChild(doc.createTextNode(e.getStartDate()));
					details.appendChild(startDate);
	
					
        	
								
				
				
				// dept code elements
				Element deptCode = doc.createElement("deptCode");
				deptCode.appendChild(doc.createTextNode(e.getDeptCode()));
				employee.appendChild(deptCode);
						
				
				
				
				
				
				
				
				
			}
			
				
		

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("newEmployees.xml"));


			transformer.transform(source, result);

			System.out.println("File saved: newEmployees.xml");

		  } catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		  } catch (TransformerException tfe) {
			tfe.printStackTrace();
		  }
		}
	}


