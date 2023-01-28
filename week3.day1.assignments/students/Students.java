package org.students;

public class Students {
	public static void main(String[] args) {

		Students s = new Students();
		s.getStudentInfo(12121);
		s.getStudentInfo(12121, "Evansley Samuel R");
		s.getStudentInfo("evan@gmail.com", 2457892);

	}

	public void getStudentInfo(int studentId) {

		System.out.println("Student Id: " + studentId);
	}

	public void getStudentInfo(int studentId, String studentName) {
		System.out.println("Student Id: " + studentId + " and Student Name: " + studentName);
	}

	public void getStudentInfo(String studentEmail, int studentPhoneNumber) {
		System.out.println("Student Id: " + studentEmail + " and Student Name: " + studentPhoneNumber);
	}
}
