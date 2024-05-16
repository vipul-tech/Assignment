package com.collect.assignment2;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private int rollNo;
	private String name;
	private String schoolName;
	public Student() {
		super();
	}
	public Student(int rollNo, String name, String schoolName) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.schoolName = schoolName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, rollNo, schoolName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollNo == other.rollNo
				&& Objects.equals(schoolName, other.schoolName);
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", schoolName=" + schoolName + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.rollNo-o.getRollNo();
	}
}
