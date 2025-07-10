package jattask6;

public class Mainclass2 {
	    public static void main(String[] args) {
	        Employee emp = new Employee(103, "raghul", "rasu", 10000);

	        System.out.println("Name: " + emp.getName());
	        System.out.println("Annual Salary: " + emp.getAnnualSalary());
	        System.out.println("Raised Salary: " + emp.raiseSalary(10));
	        System.out.println(emp); 
	    }
	}



