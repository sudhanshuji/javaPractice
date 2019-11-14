package diagnosticCentre.manager;

import daiagnosticCentre.dto.ReportDto;
import daiagnosticCentre.dto.TestDto;
import diagnosticCentre.exceptions.ServiceException;

public interface TestManager {

	String addTests(TestDto dto) throws ServiceException;

	ReportDto retrieveTestDetailsByEmail(String Email, String date);

	ReportDto retrieveTestDetailsByPhone(String Phone, String date);

}
