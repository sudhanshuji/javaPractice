
package com.mindtree.assignment2.question2;

public class Student {

	private int studentId;
	private String studentName;
	private int studentScore;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Student(){}
	
	public Student(int id, String name, int score){
		
		studentId = id;
		studentName = name;
		studentScore = score;
		
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentScore() {
		return studentScore;
	}
	public void setStudentScore(int studentScore) {
		this.studentScore = studentScore;
	}
	
}
