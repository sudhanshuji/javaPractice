package diagnosticCentre.entity;

import java.util.Date;

public class Patient {

	private Integer pId;
	private String phone;
	private String email;
	private String name;
	private Date DOB;
	/**
	 * 
	 */
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param pId
	 * @param phone
	 * @param email
	 * @param name
	 * @param dOB
	 */
	public Patient(Integer pId, String phone, String email, String name, Date dOB) {
		this.pId = pId;
		this.phone = phone;
		this.email = email;
		this.name = name;
		DOB = dOB;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Patient [pId=" + pId + ", phone=" + phone + ", email=" + email + ", name=" + name + ", DOB=" + DOB
				+ "]";
	}
	/**
	 * @return the pId
	 */
	public Integer getpId() {
		return pId;
	}
	/**
	 * @param pId the pId to set
	 */
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the dOB
	 */
	public Date getDOB() {
		return DOB;
	}
	/**
	 * @param dOB the dOB to set
	 */
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DOB == null) ? 0 : DOB.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pId == null) ? 0 : pId.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
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
		Patient other = (Patient) obj;
		if (DOB == null) {
			if (other.DOB != null)
				return false;
		} else if (!DOB.equals(other.DOB))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pId == null) {
			if (other.pId != null)
				return false;
		} else if (!pId.equals(other.pId))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}	
	
	
}
