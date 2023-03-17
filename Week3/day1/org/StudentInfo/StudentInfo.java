package org.StudentInfo;

public class StudentInfo {
	public int getStudentInfo(int id) {
		id = 003;
		System.out.println("Student id = " + id);
		return id;
	}

	public int getStudentInfo(int id, String name) {
		id = 123;
		name = "Shah";
		System.out.println("Student id = " + id);
		System.out.println("Student name = " + name);
		return id;
	}

	public void getStudentInfo(String mailid, String PhoneNo) {
		mailid = "shah@g.com";
		PhoneNo = "+61 213512";
		System.out.println("Student Mailid = " + mailid);
		System.out.println("Contact No. = " + PhoneNo);

	}

	public static void main(String[] args) {
		StudentInfo obj = new StudentInfo();
		obj.getStudentInfo(0);
		obj.getStudentInfo(0, null);
		obj.getStudentInfo(null, null);

	}

}
