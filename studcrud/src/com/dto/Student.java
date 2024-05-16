package com.dto;

public class Student implements Comparable<Student>{
	private int stdNumber;
	private String firstName;
	private String lastName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stdNumber, String firstName, String lastName) {
		super();
		this.stdNumber = stdNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getStdNumber() {
		return stdNumber;
	}
	public void setStdNumber(int stdNumber) {
		this.stdNumber = stdNumber;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + stdNumber;
		return result;
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
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (stdNumber != other.stdNumber)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [stdNumber=" + stdNumber + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.getStdNumber() -o.getStdNumber();
	}
	

}
