/**
 * 
 */
package entity;

import java.util.Date;

/**
 * @author Golu
 *
 */
public class Student {

	private String name;
	private Date dateOfBirth;
	private int year;
	private Department dept;
	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, Date dateOfBirth, int year, Department dept) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.year = year;
		this.dept = dept;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the dept
	 */
	public Department getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(Department dept) {
		this.dept = dept;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", dateOfBirth=" + dateOfBirth + ", year=" + year + ", dept=" + dept + "]";
	}
	
	
	

}
