package diagnosticCentre.entity;

public class Test {
	private int tId;
	private String testName;
	private int cost;
	/**
	 * 
	 */
	public Test() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param tId
	 * @param testName
	 * @param cost
	 */
	public Test(int tId, String testName, int cost) {
		this.tId = tId;
		this.testName = testName;
		this.cost = cost;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Test [tId=" + tId + ", testName=" + testName + ", cost=" + cost + "]";
	}
	/**
	 * @return the tId
	 */
	public int gettId() {
		return tId;
	}
	/**
	 * @param tId the tId to set
	 */
	public void settId(int tId) {
		this.tId = tId;
	}
	/**
	 * @return the testName
	 */
	public String getTestName() {
		return testName;
	}
	/**
	 * @param testName the testName to set
	 */
	public void setTestName(String testName) {
		this.testName = testName;
	}
	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cost;
		result = prime * result + tId;
		result = prime * result + ((testName == null) ? 0 : testName.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (cost != other.cost)
			return false;
		if (tId != other.tId)
			return false;
		if (testName == null) {
			if (other.testName != null)
				return false;
		} else if (!testName.equals(other.testName))
			return false;
		return true;
	}
	
	

}
