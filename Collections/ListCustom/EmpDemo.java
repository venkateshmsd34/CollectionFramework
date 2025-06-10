package com.raju.listcustom;

import java.util.ArrayList;

public class EmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an Arraylist
		ArrayList<Employee> employeeList = new ArrayList<>();
		Employee employee = new Employee("Raju",34,"Hyderabad","IT",32000);
		employeeList.add(employee);
		employeeList.add(new Employee("Priya",97,"Banglore","Marketing",48000));
		employeeList.add(new Employee("Srinivas",16,"Chennai","HR",28000));
		employeeList.add(new Employee("Jyo",8,"USA","IT",98000));
		employeeList.add(new Employee("Prakesh",87,"Hyderabad","Marketing",40000));
		
		System.out.println(employeeList);
		
		System.out.println();
		
		for(Employee employee1 : employeeList) {
			System.out.println(employee1);
		}
		
		System.out.println();
		System.out.println("get by city");
		String city ="Banglore";
		
		ArrayList<Employee> employeeByCity = new ArrayList<>();
		for(Employee employee1 : employeeList) {
			String empcity = employee1.getCity();
			if(empcity.equals(city)) {
				//add new list
				employeeByCity.add(employee1);
			}
		}
		for(Employee employee1 : employeeByCity) {
			System.out.println(employee1.getEmployeeName().toUpperCase());
		}
		

	}

}

//output
[Employee [employeeName=Raju, employeeId=34, city=Hyderabad, department=IT, salary=32000.0], Employee [employeeName=Priya, employeeId=97, city=Banglore, department=Marketing, salary=48000.0], Employee [employeeName=Srinivas, employeeId=16, city=Chennai, department=HR, salary=28000.0], Employee [employeeName=Jyo, employeeId=8, city=USA, department=IT, salary=98000.0], Employee [employeeName=Prakesh, employeeId=87, city=Hyderabad, department=Marketing, salary=40000.0]]

Employee [employeeName=Raju, employeeId=34, city=Hyderabad, department=IT, salary=32000.0]
Employee [employeeName=Priya, employeeId=97, city=Banglore, department=Marketing, salary=48000.0]
Employee [employeeName=Srinivas, employeeId=16, city=Chennai, department=HR, salary=28000.0]
Employee [employeeName=Jyo, employeeId=8, city=USA, department=IT, salary=98000.0]
Employee [employeeName=Prakesh, employeeId=87, city=Hyderabad, department=Marketing, salary=40000.0]

get by city
PRIYA
