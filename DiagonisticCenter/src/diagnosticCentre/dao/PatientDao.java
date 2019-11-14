package diagnosticCentre.dao;

import java.util.Date;
import java.util.Set;

import daiagnosticCentre.dto.ReportDto;
import diagnosticCentre.exceptions.DaoException;

public interface PatientDao {
	int getPidByEmail(String emailId) throws DaoException;

	int getPidByPhone(String PhoneNo) throws DaoException;

	Set<String> getListOfEmail() throws DaoException;

	Set<String> getListOfPhone() throws DaoException;

	String getPhoneByPid(int pId) throws DaoException;

	String getNameByPid(int pId) throws DaoException;

	ReportDto fetchTestDetailsForPatientByEmail(String email, Date date) throws DaoException;

	ReportDto fetchTestDetailsForPatientByPhone(String phone, Date date) throws DaoException;
}
