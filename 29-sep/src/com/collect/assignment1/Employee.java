package com.collect.assignment1;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String name;
	private int salary;
	private String desig;
	
	public Employee() {
		super();
	}
	public Employee(int empId, String name, int salary, String desig) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.desig = desig;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", desig=" + desig + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(desig, empId, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(desig, other.desig) && empId == other.empId && Objects.equals(name, other.name)
				&& salary == other.salary;
	}
	@Override
	public int compareTo(Employee o) {
		return this.empId-o.getEmpId();
	}
	
}
