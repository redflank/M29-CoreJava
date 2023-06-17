package org.tnsif.entities;

public class Student {

	// private data members
	private int rollNo;
	private String studentName;

	// default constructor
	public Student() {

	}

	// parameterized constructor
	public Student(int rollNo, String studentName) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
	}

	// getters and setters
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + "]";
	}

}
