//package daiagnosticCentre.tests;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.Test;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//
//import diagnosticCentre.dao.PatientDao;
//import diagnosticCentre.dao.PatientDaoImpl;
//import diagnosticCentre.dao.TestDaoImpl;
//import diagnosticCentre.exceptions.DaoException;
//
//public class TestDao {
//
//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//
//	}
//
//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//
//	}
//
//	@BeforeEach
//	void setUp() throws Exception {
//	}
//
//	@AfterEach
//	void tearDown() throws Exception {
//	}
//
//	@Test
//	public void testGetPidByEmail() {
//		PatientDao dao = new PatientDaoImpl();
//		int actual;
//		try {
//			actual = dao.getPidByEmail("ramesh@gmail.com");
//		} catch (DaoException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(actual);
//		assertTrue(actual>0);
//		}
//
//	@Test
//	public void testGetPidByPhone() {
//	}
//
//	@Test
//	public void testGetTidByTestName() {
//		diagnosticCentre.dao.TestDao testdao = new TestDaoImpl();
//		int actual;
//		try {
//			actual = testdao.getTidByTestName("ECG");
//		} catch (DaoException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(actual);
//		assertTrue(actual > 0);
//	}
//
//}
