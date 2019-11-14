/**
 * 
 */
package daiagnosticCentre.dto;

import java.util.*;

import diagnosticCentre.entity.Test;

/**
 * @author Sudhanshu
 *
 */
public class TestDto {

	private List<Test> test;
	private String email;
	private String phone;

	/**
	 * 
	 */
	public TestDto() {

	}

	/**
	 * @param test
	 * @param email
	 * @param phone
	 */
	public TestDto(List<Test> test, String email, String phone) {
		this.test = test;
		this.email = email;
		this.phone = phone;
	}

	/**
	 * @return the test
	 */
	public List<Test> getTest() {
		return test;
	}

	/**
	 * @param test the test to set
	 */
	public void setTest(List<Test> test) {
		this.test = test;
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

}
