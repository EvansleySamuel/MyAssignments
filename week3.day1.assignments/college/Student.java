package org.college;

public class Student extends Department {
	
	public static void main(String[] args) {
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.departmentName();
		s.studentName();
		s.studentDepartment();
		s.studentId();
	}

	public void studentName() {
		System.out.println("Student Name: Evansley Samuel R");
	}

	public void studentDepartment() {
		System.out.println("Student Department: Mechanical");
	}

	public void studentId() {
		System.out.println("Student ID: RL12345");
	}
}
