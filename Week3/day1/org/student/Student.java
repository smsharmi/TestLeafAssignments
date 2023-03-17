package org.student;

import org.department.Department;
import org.college.College;

public class Student extends College implements Department {
	public void studentName() {
		System.out.println("Shah");
	}

	public void studentID() {
		System.out.println("123521");
	}

	public static void main(String[] args) {
		Student data = new Student();
		data.collegeCode();
		data.collegeName();
		data.collegeRank();
		data.studentID();
		data.studentName();
		data.deptName();
	}

	public void deptName() {

		System.out.println("Electrical Engg");

	}
}
