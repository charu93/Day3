package org.emp;

public class Employee {
	
	//empId(),empName(),empDob(),empPhone(),empEmail(),empAddress()
public void empId() {
	System.out.println("Employee ID is 2000");
}
public void empName() {
	System.out.println("Employee Name is Charu");
	
}
public void empDob() {
	System.out.println("Emp Dob: 04 Jan 1994 ");
}
public  void test() {
	System.out.println("Task 1");
}
public void empPhone() {
	System.out.println("Employee Phone num is 7708583705");
}
public void empEmail() {
	System.out.println("Emp email id is charmila0409@gmail.com");
	
}
public void empAddress() {
	System.out.println("Employee Address is Bangalore");
}

public static void main(String[] args) {
	Employee e = new Employee();
	e.empAddress();
	e.empDob();
	e.empEmail();
	e.empId();
	e.empName();
	e.empPhone();
	e.test();
}
}

