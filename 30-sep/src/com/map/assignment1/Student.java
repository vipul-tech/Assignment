package com.map.assignment1;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private int rollNo;
	private String name;
	private String favouriteSubject;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, String favouriteSubject) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.favouriteSubject = favouriteSubject;
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

	public String getFavouriteSubject() {
		return favouriteSubject;
	}

	public void setFavouriteSubject(String favouriteSubject) {
		this.favouriteSubject = favouriteSubject;
	}

	@Override
	public int hashCode() {
		return Objects.hash(favouriteSubject, name, rollNo);
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
		return Objects.equals(favouriteSubject, other.favouriteSubject) && Objects.equals(name, other.name)
				&& rollNo == other.rollNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", favouriteSubject=" + favouriteSubject + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.rollNo-o.getRollNo();
	}
	
	
}
