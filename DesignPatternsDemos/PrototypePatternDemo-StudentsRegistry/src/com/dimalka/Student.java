package com.dimalka;

public class Student extends Person{
	String assignmentStatus;
	
	public String getAssignmentStatus() {
		return assignmentStatus;
	}

	public void setAssignmentStatus(String assignmentStatus) {
		this.assignmentStatus = assignmentStatus;
	}
	
	@Override
	public String toString() {
		return "\nStudent [name=" + name + ", assignmentStatus=" + assignmentStatus + "]\n";
	}
}
