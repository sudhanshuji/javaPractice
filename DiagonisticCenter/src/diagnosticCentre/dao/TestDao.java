package diagnosticCentre.dao;

import java.util.Set;

import diagnosticCentre.exceptions.DaoException;

public interface TestDao {

	int getTidByTestName(String testName)throws DaoException;
	Set<String> getListOfTestNames() throws DaoException;
}
