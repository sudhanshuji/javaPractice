package date.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateService {

	public Date parseStringDate(String strDate, String dateFormat) throws Exception {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		try {
			date = sdf.parse(strDate);
			return date;
		} catch (ParseException e) {
			throw new Exception(e);
		}

	}

	public String formatDate(Date date, String dateFormat) {
		String strDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		strDate = sdf.format(date);
		return strDate;
	}

}
