package practice.entity;

public class College {
	private String collegeCode;
	private String collegeName;
	private University university;
	/**
	 * 
	 */
	public College() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param collegeCode
	 * @param collegeName
	 * @param university
	 */
	public College(String collegeCode, String collegeName, University university) {
		this.collegeCode = collegeCode;
		this.collegeName = collegeName;
		this.university = university;
	}
	/**
	 * @return the collegeCode
	 */
	public String getCollegeCode() {
		return collegeCode;
	}
	/**
	 * @param collegeCode the collegeCode to set
	 */
	public void setCollegeCode(String collegeCode) {
		this.collegeCode = collegeCode;
	}
	/**
	 * @return the collegeName
	 */
	public String getCollegeName() {
		return collegeName;
	}
	/**
	 * @param collegeName the collegeName to set
	 */
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	/**
	 * @return the university
	 */
	public University getUniversity() {
		return university;
	}
	/**
	 * @param university the university to set
	 */
	public void setUniversity(University university) {
		this.university = university;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((collegeCode == null) ? 0 : collegeCode.hashCode());
		result = prime * result + ((collegeName == null) ? 0 : collegeName.hashCode());
		result = prime * result + ((university == null) ? 0 : university.hashCode());
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
		College other = (College) obj;
		if (collegeCode == null) {
			if (other.collegeCode != null)
				return false;
		} else if (!collegeCode.equals(other.collegeCode))
			return false;
		if (collegeName == null) {
			if (other.collegeName != null)
				return false;
		} else if (!collegeName.equals(other.collegeName))
			return false;
		if (university == null) {
			if (other.university != null)
				return false;
		} else if (!university.equals(other.university))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "College [collegeCode=" + collegeCode + ", collegeName=" + collegeName + ", university=" + university
				+ "]";
	}
	

}
