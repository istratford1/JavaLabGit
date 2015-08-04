package javalab.day11.JUnitTesting;

import static org.junit.Assert.*;
import org.junit.Test;


public class CompanyTest {

	@Test

	public void testHire(){

	Company c = new Company( "MySoft", 100 );

	c.hire( 50 );

	Company expected = new Company( "MySoft", 150 );

	assertEquals( c, expected );

	}
	
	public void testAquire(){
		
		
		Company c = new Company("TestCom", 100);
		Company a = new Company("AquiredCom", 250);
		
		int expectedEmployeeNum = 350;
		
		c.aquire(a);
		
		assertEquals(c.numEmployees, expectedEmployeeNum);
		
		
		
		
		
		
		
	}
	
	
	

	
	
}
