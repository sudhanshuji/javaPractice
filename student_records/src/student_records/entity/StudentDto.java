package student_records.entity;

public class StudentDto {
	private int stream_id;
    private	int students_count;
	/**
	 * 
	 */
	public StudentDto() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param stream_id
	 * @param students_count
	 */
	public StudentDto(int stream_id, int students_count) {
		this.stream_id = stream_id;
		this.students_count = students_count;
	}
	
	/**
	 * @return the stream_id
	 */
	public int getStream_id() {
		return stream_id;
	}
	/**
	 * @param stream_id the stream_id to set
	 */
	public void setStream_id(int stream_id) {
		this.stream_id = stream_id;
	}
	/**
	 * @return the students_count
	 */
	public int getStudents_count() {
		return students_count;
	}
	/**
	 * @param students_count the students_count to set
	 */
	public void setStudents_count(int students_count) {
		this.students_count = students_count;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stream_id;
		result = prime * result + students_count;
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
		StudentDto other = (StudentDto) obj;
		if (stream_id != other.stream_id)
			return false;
		if (students_count != other.students_count)
			return false;
		return true;
	}
	
	
    
    
}
