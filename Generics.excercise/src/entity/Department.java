/**
 * 
 */
package entity;

/**
 * @author saura
 *
 */
public class Department {

	private String dept;
	private String hod;
	
	public Department(String dept, String hod) {
		super();
		this.dept = dept;
		this.hod = hod;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getHod() {
		return hod;
	}
	public void setHod(String hod) {
		this.hod = hod;
	}
	/**
	 * 
	 */
	public Department() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Department [dept=" + dept + ", hod=" + hod + "]";
	}
	
	

}
