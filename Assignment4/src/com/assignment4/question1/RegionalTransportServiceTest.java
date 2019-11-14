package com.assignment4.question1;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author C2-Orchard
 *	Test class to test RegionalTransportService
 */
public class RegionalTransportServiceTest {

	@Test
	public void UTC_01_01(){
		// input list 
		List<String> inputList = new ArrayList<String>();
		inputList.add("KA-55-AB-4555");
		inputList.add("KA-01-EF-4444");
		inputList.add("KA-04-AB-9000");
		inputList.add("KA-56-200");
		inputList.add("KA-50-T-3111");
		inputList.add("KA-02-AG-9243");
		
		// excepted list after sorting based on Area name
		List<String> expectedList = new ArrayList<String>();
		expectedList.add("KA-56-200");
		expectedList.add("KA-01-EF-4444");
		expectedList.add("KA-55-AB-4555");
		expectedList.add("KA-02-AG-9243");
		expectedList.add("KA-50-T-3111");
		expectedList.add("KA-04-AB-9000");
		
		assertEquals(expectedList,RegionalTransportService.sortVehiclesRegisteredBasedOnArea(inputList));
	}
	
	@Test
	public void UTC_01_02(){
		// input list 
		List<String> inputList = new ArrayList<String>();
		inputList.add("KA-57-DE-111");
		inputList.add("KA-51-A-9");
		inputList.add("KA-04-500");
		inputList.add("KA-02-L-41");
		
		// excepted list after sorting based on Area name
		List<String> expectedList = new ArrayList<String>();
		expectedList.add("KA-51-A-9");
		expectedList.add("KA-02-L-41");
		expectedList.add("KA-57-DE-111");
		expectedList.add("KA-04-500");
		
		
		assertEquals(expectedList,RegionalTransportService.sortVehiclesRegisteredBasedOnArea(inputList));
	}
	
	@Test
	public void UTC_01_03(){
		// input list 
		List<String> inputList = new ArrayList<String>();
		inputList.add("KA-57-DE-111");
		inputList.add("KA-51-A-9");
		inputList.add("KA-04-500");
		inputList.add("KA-02-L-41");
		inputList.add("KA-57-AB-9011");
		inputList.add("KA-04-A-100");
		
		// excepted list after sorting based on Area name and registration sequence
		List<String> expectedList = new ArrayList<String>();
		expectedList.add("KA-51-A-9");
		expectedList.add("KA-02-L-41");
		expectedList.add("KA-57-AB-9011");
		expectedList.add("KA-57-DE-111");
		expectedList.add("KA-04-500");
		expectedList.add("KA-04-A-100");
		
		assertEquals(expectedList,RegionalTransportService.sortVehiclesRegisteredBasedOnArea(inputList));
	}
}

