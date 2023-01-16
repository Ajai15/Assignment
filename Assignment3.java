package assignment;
import java.util.*;
public class Assignment3 {
	public static void main(String[] args) { 
		System.out.println("Assignment 3");
	}
	public class Company{
		String name; 
		Employee[] employees;
		public void getName(String name){ 
			this.name = name;
		}
		public void getEmployees(Employee[] employees){ 
			this.employees = employees;
		} 
	}
	
	public class Employee{ 
		String name; 
		int employeeNumber; 
		int salary; 
		Manager manager;
		public void getName(String name){ 
			this.name = name;
		}
		public void getEmployeeNumber(int employeeNumber){ 
			this.employeeNumber = employeeNumber;
		}
		public void getSalary(int salary){ 
			this.salary = salary;
		}
		public void getManager(Manager manager){ 
			this.manager = manager;
		} 
	}
	
	public class Manager{ 
		Employee[] manages; 
		public void addTeamMember(){
			
		}
		public void getTeamMembers(Employee[] manages){ 
			this.manages = manages;
		} 
	}
	public class Contractor{ 
		Date lengthOfContract; 
		public void getLengthOfContract(Date lengthOfContract){ 
			this.lengthOfContract = lengthOfContract; 
		}
	}
}
