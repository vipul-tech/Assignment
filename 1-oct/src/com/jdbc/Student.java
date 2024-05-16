package com.jdbc;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private int rollNo;
	private String firstName;
	private String lastName;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String firstName, String lastName, int age) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, firstName, lastName, rollNo);
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
		return Objects.equals(age, other.age) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && rollNo == other.rollNo;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.rollNo-o.getRollNo();
	}
	
}
