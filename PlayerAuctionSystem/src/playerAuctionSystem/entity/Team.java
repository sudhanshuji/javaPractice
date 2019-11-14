package playerAuctionSystem.entity;

import com.mindtree.exceptions.InvalidTeamNameException;

import jdk.internal.org.objectweb.asm.util.CheckAnnotationAdapter;
import playerAuctionSystem.dao.TeamDaoImpl;

public class Team {
  private int teamid;
  private String teamName;
/**
 * 
 */
public Team() {
	// TODO Auto-generated constructor stub
}
/**
 * @param teamid
 * @param teamName
 */
public Team(int teamid, String teamName) {
	this.teamid = teamid;
	this.teamName = teamName;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Team [teamid=" + teamid + ", teamName=" + teamName + "]";
}
/**
 * @return the teamid
 */
public int getTeamid() {
	return teamid;
}
/**
 * @param teamid the teamid to set
 */
public void setTeamid(int teamid) {
	this.teamid = teamid;
}
/**
 * @return the teamName
 */
public String getTeamName() {
	return teamName;
}
/**
 * @param teamName the teamName to set
 */
public void setTeamName(String teamName) {
	this.teamName = teamName;
}
/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((teamName == null) ? 0 : teamName.hashCode());
	result = prime * result + teamid;
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
	Team other = (Team) obj;
	if (teamName == null) {
		if (other.teamName != null)
			return false;
	} else if (!teamName.equals(other.teamName))
		return false;
	if (teamid != other.teamid)
		return false;
	return true;
}
  
  
}
