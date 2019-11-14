package student_records.entity;

public class Stream {
	Integer streamId;
	String StreamName;
	/**
	 * 
	 */
	public Stream() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param streamId
	 * @param streamName
	 */
	public Stream(Integer streamId, String streamName) {
		this.streamId = streamId;
		StreamName = streamName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Stream [streamId=" + streamId + ", StreamName=" + StreamName + "]";
	}
	/**
	 * @return the streamId
	 */
	public Integer getStreamId() {
		return streamId;
	}
	/**
	 * @param streamId the streamId to set
	 */
	public void setStreamId(Integer streamId) {
		this.streamId = streamId;
	}
	/**
	 * @return the streamName
	 */
	public String getStreamName() {
		return StreamName;
	}
	/**
	 * @param streamName the streamName to set
	 */
	public void setStreamName(String streamName) {
		StreamName = streamName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((StreamName == null) ? 0 : StreamName.hashCode());
		result = prime * result + ((streamId == null) ? 0 : streamId.hashCode());
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
		Stream other = (Stream) obj;
		if (StreamName == null) {
			if (other.StreamName != null)
				return false;
		} else if (!StreamName.equals(other.StreamName))
			return false;
		if (streamId == null) {
			if (other.streamId != null)
				return false;
		} else if (!streamId.equals(other.streamId))
			return false;
		return true;
	}
	
	
}
