package date.service;

import static org.junit.jupiter.api.Assertions.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateTest {

	DateService service;

	@BeforeEach
	void beforeTest() {
		service = new DateService();
	}

	@Test
	void testParseStringDate() throws Exception {

		Date date = service.parseStringDate("2019-09-30", "yyyy-MM-dd");
		System.out.println(date);

	}

	@Test
	void testFormatDate()  {
		Date dateVar=null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			dateVar=sdf.parse("30/09/2019");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String date = service.formatDate(dateVar, "yyyy-MM-dd");
		System.out.println(date);
	}

}
