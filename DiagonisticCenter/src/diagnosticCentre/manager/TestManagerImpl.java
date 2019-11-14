package diagnosticCentre.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mysql.cj.xdevapi.Result;
import com.sun.media.sound.InvalidDataException;

import daiagnosticCentre.dto.ReportDto;
import daiagnosticCentre.dto.TestDto;
import diagnosticCentre.dao.PatientDao;
import diagnosticCentre.dao.PatientDaoImpl;
import diagnosticCentre.dao.PatientTestDao;
import diagnosticCentre.dao.PatientTestDaoImpl;
import diagnosticCentre.dao.TestDao;
import diagnosticCentre.dao.TestDaoImpl;
import diagnosticCentre.entity.PatientTest;
import diagnosticCentre.entity.Test;
import diagnosticCentre.exceptions.DaoException;
import diagnosticCentre.exceptions.InvalidDateException;
import diagnosticCentre.exceptions.InvalidEmailIdException;
import diagnosticCentre.exceptions.InvalidPhoneNumberException;
import diagnosticCentre.exceptions.InvalidTestNameException;
import diagnosticCentre.exceptions.ServiceException;
import diagnosticCentre.util.ValidationUtil;
import diagnosticCentre.util.ValidationUtilImpl;

public class TestManagerImpl implements TestManager {
	PatientDao patientDao;
	TestDao testDao;
	PatientTestDao patientTestDao;
	ValidationUtil validate;

	// TODO add constructor to initialize member variables

	/**
	 * 
	 */
	public TestManagerImpl() {
		patientDao = new PatientDaoImpl();
		testDao = new TestDaoImpl();
		patientTestDao = new PatientTestDaoImpl();
		validate = new ValidationUtilImpl();
	}

	@Override
	public String addTests(TestDto dto) throws ServiceException {
		String result = "";
		List<PatientTest> patientTests = null;

		/*
		 * declare a list of patient_test. fetch pid from email/phone present in dto.
		 * iterate through the test list present in dto parameter. fetch tid from the
		 * test name present in the list. create new patientTest Object using pid and
		 * tid. and add them in list. after for loop pass the list to patient_test dao.
		 * if dao returns true then return message to client.
		 */
		if (dto.getEmail() == null && dto.getPhone() == null) {
			System.out.println("enter valid email or phone Number");
			// return "";
		} else {
			boolean isValid = false;
			try {
				isValid = validate.validateTest(dto);
			} catch (InvalidEmailIdException | DaoException | InvalidPhoneNumberException
					| InvalidTestNameException e1) {
				e1.printStackTrace();
				throw new ServiceException(e1);
			}
			if (isValid) {
				int Pid = 0;
				if (dto.getEmail() != null) {
					try {
						Pid = patientDao.getPidByEmail(dto.getEmail());
					} catch (DaoException e2) {
						throw new ServiceException(e2);
					}
				} else {
					try {
						Pid = patientDao.getPidByPhone(dto.getPhone());
					} catch (DaoException e2) {
						throw new ServiceException(e2);
					}

				}
				patientTests = new ArrayList<>();
				int tId = 0;

				for (Test test : dto.getTest()) {
					PatientTest patientTest = new PatientTest();
					try {
						tId = testDao.getTidByTestName(test.getTestName());
					} catch (DaoException e) {
						throw new ServiceException(e);
					}
					patientTest.setPid(Pid);
					patientTest.setTid(tId);
					patientTest.setDate(new Date());

					patientTests.add(patientTest);
				}
//				try {
//					patientTestDao.insertTestRecords(patientTests);
//				} catch (DaoException ex) {
//					// TODO Auto-generated catch block
//					throw new ServiceException(ex);
//				}
				try {
					if (patientTestDao.insertTestRecords(patientTests))
						result = "Tests details are successfully saved";
					else
						result = "Tests details are not saved";
				} catch (DaoException e) {
					throw new ServiceException(e);
				}
			} else
				return "Not Valid";
		}
		// return "Tests details are successfully saved";
		return result;
	}

	@Override
	public ReportDto retrieveTestDetailsByEmail(String email, String date) {
		ReportDto result = null;
		Date dateObj = null;
		try {
			dateObj = validate.validateDate(date);
		} catch (InvalidDateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			result = patientDao.fetchTestDetailsForPatientByEmail(email, dateObj);
			result.setEmail(email);
			
			result.setDate(dateObj);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		/*
		 * retrieve pid by email given. retrieve name by email given. retrieve phone by
		 * email given. declare a list of tid. retrieve Tids from patient_test for the
		 * corresponding pid where date equals to given date and add them to the list.
		 * from this list retrieve test name and corresponding cost from test for each
		 * element present in the list. declare a list of ReportDto. set allabove
		 * element and add them to the list.
		 */

		return result;
	}

	@Override
	public ReportDto retrieveTestDetailsByPhone(String Phone, String date) {
		// TODO Auto-generated method stub
		return null;
	}

}
