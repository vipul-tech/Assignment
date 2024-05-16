package com.client;

import java.util.*;

import com.dto.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;


public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeServiceImpl();
//		service.addRecord(new Employee(13,"Richa",31,"Manager",90000));
//		service.addRecord(new Employee(14,"Ankit",21,"Clerk",20000));
//		service.addRecord(new Employee(15,"Dolly",23,"Tester",30000));
//		service.addRecord(new Employee(10,"Kamlesh",21,"Programmer",50000));
//		service.addRecord(new Employee(16,"Anshika",29,"Manager",85000));

		List<Employee> employeeList = service.getAllEmployees();
		for(Employee x : employeeList) {
			System.out.println(x.getEmpId()+" "+x.getName() +" "+x.getAge()+" "+x.getDesig()+" "+x.getSalary());
		}
	}
}
