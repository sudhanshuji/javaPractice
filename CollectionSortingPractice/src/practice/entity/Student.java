package practice.entity;

public class Student implements Comparable<Student> {
	private String studentName;
	private College college;

	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param studentName
	 * @param college
	 */
	public Student(String studentName, College college) {
		this.studentName = studentName;
		this.college = college;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the college
	 */
	public College getCollege() {
		return college;
	}

	/**
	 * @param college the college to set
	 */
	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public int compareTo(Student o) {
		int sn=this.studentName.compareTo(o.getStudentName());
		if (sn==0) {
			int cn=this.college.getCollegeName().compareTo(o.getCollege().getCollegeName());
			if(cn==0) {
				int un=this.college.getUniversity().getUniversityName().compareTo(o.college.getUniversity().getUniversityName());
				return un;
			}else
				return cn;
		}else 
			return sn;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((college == null) ? 0 : college.hashCode());
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
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
		Student other = (Student) obj;
		if (college == null) {
			if (other.college != null)
				return false;
		} else if (!college.equals(other.college))
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", college=" + college + "]";
	}
	
	
}
