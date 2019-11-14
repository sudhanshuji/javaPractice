package daiagnosticCentre.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import daiagnosticCentre.dto.ReportDto;
import daiagnosticCentre.dto.TestDto;
import diagnosticCentre.exceptions.DaoException;
import diagnosticCentre.exceptions.InvalidEmailIdException;
import diagnosticCentre.exceptions.InvalidPhoneNumberException;
import diagnosticCentre.exceptions.InvalidTestNameException;
import diagnosticCentre.exceptions.ServiceException;
import diagnosticCentre.manager.TestManager;
import diagnosticCentre.manager.TestManagerImpl;

public class TestManagerTest {

	private static TestDto dto;
	private static TestManager testManager;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testManager = new TestManagerImpl();
		dto = new TestDto();
		dto.setPhone("9900012345");
		List<diagnosticCentre.entity.Test> tests = new ArrayList<>();
		diagnosticCentre.entity.Test test1 = new diagnosticCentre.entity.Test();
		diagnosticCentre.entity.Test test2 = new diagnosticCentre.entity.Test();
		diagnosticCentre.entity.Test test3 = new diagnosticCentre.entity.Test();
		test1.setTestName("ECG");
		test2.setTestName("HBA1c");
		test3.setTestName("MRI Scanning");
		tests.add(test1);
		tests.add(test2);
		tests.add(test3);
		dto.setTest(tests);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

//	@BeforeEach
//	void setUp() throws Exception {
//	}
//
//	@AfterEach
//	void tearDown() throws Exception {
//	}

	/**
	 * Positive test case to test the feature to add tests for a patient by email
	 * 
	 * @throws ServiceException
	 */
//	@Test
//	public void testAddTestsByEmail() throws ServiceException {
//
//		String expected = "Tests details are successfully saved";
//		String actual = null;
//		try {
//			actual = testManager.addTests(dto);
//			System.out.println(actual.toString());
//		} catch (Exception e) {
//			throw new ServiceException(e.getMessage());
//		}
//
//		assertEquals(expected, actual);
//	}

	/**
	 * Positive test case to test the feature to add tests for a patient by phone
	 * 
	 * @throws ServiceException
	 */
	@Test
	public void testAddTestsByPhone() throws ServiceException {

		String expected = "Tests details are successfully saved";
		String actual = null;
		try {
			actual = testManager.addTests(dto);
			System.out.println(actual.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e);
		}
		assertEquals(expected, actual);
	}

	@Test
	public void testGenerateReportPositive() {
		ReportDto report = testManager.retrieveTestDetailsByEmail("mahesh@gmail.com", "08/11/2019");
		System.out.println(report.toString());
		
	}

	/**
	 * Negative test case to test if user enters an invalid email
	 */
//	@Test(expected = InvalidEmailIdException.class)
//	public void testAddTestsByEmailNegative() {
//		String expected = "Tests details are successfully saved";
//		String actual = null;
//		try {
//			actual = testManager.addTests(dto);
//		} catch (InvalidEmailIdException | InvalidPhoneNumberException | InvalidTestNameException | DaoException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		assertEquals(expected, actual);
//	}

}
