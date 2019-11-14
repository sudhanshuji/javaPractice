package com.assignment4.question1;

public class VehicleNumber implements Comparable<VehicleNumber> {

	private String rtoName;
	private String vehicleNumber;

	public VehicleNumber() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param rtoCode
	 * @param vehicleNumber
	 */
	public VehicleNumber(String rtoCode, String vehicleNumber) {
		this.rtoName = rtoCode;
		this.vehicleNumber = vehicleNumber;
	}

	/**
	 * @return the rtoCode
	 */
	public String getRtoCode() {
		return rtoName;
	}

	/**
	 * @param rtoCode the rtoCode to set
	 */
	public void setRtoCode(String rtoCode) {
		this.rtoName = rtoCode;
	}

	/**
	 * @return the vehicleNumber
	 */
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	/**
	 * @param vehicleNumber the vehicleNumber to set
	 */
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rtoName == null) ? 0 : rtoName.hashCode());
		result = prime * result + ((vehicleNumber == null) ? 0 : vehicleNumber.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		VehicleNumber other = (VehicleNumber) obj;
		if (rtoName == null) {
			if (other.rtoName != null)
				return false;
		} else if (!rtoName.equals(other.rtoName))
			return false;
		if (vehicleNumber == null) {
			if (other.vehicleNumber != null)
				return false;
		} else if (!vehicleNumber.equals(other.vehicleNumber))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VehicleNumber [rtoCode=" + rtoName + ", vehicleNumber=" + vehicleNumber + ", getRtoCode()="
				+ getRtoCode() + ", getVehicleNumber()=" + getVehicleNumber() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(VehicleNumber o) {

		int r1 = this.rtoName.compareTo(o.rtoName);
		if (r1 == 0) {
			r1 = this.vehicleNumber.compareTo(o.vehicleNumber);
		}

		return r1;
	}

}
