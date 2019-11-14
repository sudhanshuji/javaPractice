package diagnosticCentre.dao;

import java.util.List;

import daiagnosticCentre.dto.TestDto;
import diagnosticCentre.entity.PatientTest;
import diagnosticCentre.exceptions.DaoException;

public interface PatientTestDao {
    boolean insertTestRecords(PatientTest PatientTestDetails) throws DaoException;
    boolean insertTestRecords(List<PatientTest> PatientTestDetails) throws DaoException;
    
        
}
