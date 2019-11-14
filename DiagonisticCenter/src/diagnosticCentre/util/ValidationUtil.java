package diagnosticCentre.util;

import java.util.Date;

import com.sun.media.sound.InvalidDataException;

import daiagnosticCentre.dto.TestDto;
import diagnosticCentre.exceptions.DaoException;
import diagnosticCentre.exceptions.InvalidDateException;
import diagnosticCentre.exceptions.InvalidEmailIdException;
import diagnosticCentre.exceptions.InvalidPhoneNumberException;
import diagnosticCentre.exceptions.InvalidTestNameException;

public interface ValidationUtil {
    public boolean validateTest(TestDto dto) throws InvalidEmailIdException, DaoException, InvalidPhoneNumberException, InvalidTestNameException;

	Date validateDate(String date) throws InvalidDateException;
}
