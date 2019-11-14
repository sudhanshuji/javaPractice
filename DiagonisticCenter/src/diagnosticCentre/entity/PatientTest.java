package diagnosticCentre.entity;

import java.util.Date;

public class PatientTest {
	private int pid;
	private int tid;
	private Date date;

	/**
	 * 
	 */
	public PatientTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param pid
	 * @param tid
	 * @param date
	 */
	public PatientTest(int pid, int tid, Date date) {
		this.pid = pid;
		this.tid = tid;
		this.date = date;
	}

	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}

	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}

	/**
	 * @return the tid
	 */
	public int getTid() {
		return tid;
	}

	/**
	 * @param tid the tid to set
	 */
	public void setTid(int tid) {
		this.tid = tid;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

}
