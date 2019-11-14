package diagnosticCentre.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.media.sound.InvalidDataException;

import daiagnosticCentre.dto.TestDto;
import diagnosticCentre.dao.PatientDao;
import diagnosticCentre.dao.PatientDaoImpl;
import diagnosticCentre.dao.TestDao;
import diagnosticCentre.dao.TestDaoImpl;
import diagnosticCentre.entity.Test;
import diagnosticCentre.exceptions.DaoException;
import diagnosticCentre.exceptions.InvalidDateException;
import diagnosticCentre.exceptions.InvalidEmailIdException;
import diagnosticCentre.exceptions.InvalidPhoneNumberException;
import diagnosticCentre.exceptions.InvalidTestNameException;

public class ValidationUtilImpl implements ValidationUtil {
	PatientDao patientDao = new PatientDaoImpl();
	TestDao testDao = new TestDaoImpl();

	private boolean validateEmail(String email) throws DaoException {
		if (patientDao.getListOfEmail().contains(email))
			return true;
		else
			return false;

	}

	private boolean validatePhone(String phone) throws DaoException {
		if (patientDao.getListOfPhone().contains(phone))
			return true;
		else
			return false;

	}

	private boolean validateTestName(String testName) throws DaoException {
		if (testDao.getListOfTestNames().contains(testName))
			return true;
		else
			return false;

	}
	@Override
	public Date validateDate(String date) throws InvalidDateException {
		Date dateObj = null;

		String dateFormat = "dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		try {
			dateObj = sdf.parse(date);
			return dateObj;
		} catch (ParseException e) {
			throw new InvalidDateException("Invalid date plaease check your input");
		}

	}

	@Override
	public boolean validateTest(TestDto dto)
			throws InvalidEmailIdException, DaoException, InvalidPhoneNumberException, InvalidTestNameException {
		if (!validateEmail(dto.getEmail()) && dto.getPhone() == null)
			throw new InvalidEmailIdException("Invalid email id please check your input");
		else if (!validatePhone(dto.getPhone()) && dto.getEmail() == null)
			throw new InvalidPhoneNumberException("Invalid phone number please check your input");
		for (Test test : dto.getTest()) {
			if (!validateTestName(test.getTestName()))

				throw new InvalidTestNameException("Invalid test name please check your input");
		}
		return true;
	}

	/**
	 * 
	 */

}
