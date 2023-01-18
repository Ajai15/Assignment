package assignment;
import java.util.*;
class Employee{
	String employeeId;
	String employeeName;
	String department;
	Employee(String s1,String s2,String s3){
		setId(s1);
		setName(s2);
		setDepartment(s3);
	}
	
	public void setId(String s) {
		this.employeeId=s;
	}
	public void setName(String s) {
		this.employeeName=s;
	}
	public void setDepartment(String s) {
		this.department=s;
	}
	
	public String getId() {
		return employeeId;
	}
	public String getName() {
		return employeeName;
	}
	public String getDepartment() {
		return department;
	}
	
	public void calculateTax() {
		
	}
    @Override
    public String toString(){
        String s=String.format("%-10s %-20s %-15s",employeeId,employeeName,department);
        return s;
    }
    
}

class PermanentEmployee extends Employee{
    private double monthlySalary;
    private double pf;
    private double tax;
   
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public void setPf(double pf){
        this.pf = pf;
    }
    public double getMonthlySalary(){
        return monthlySalary;
    }
    public double getPf(){
        return pf;
    }
    public double getTax(){
        return tax;
    }
    public PermanentEmployee(String employeeId, String employeeName, String department, double monthlySalary) {
        super(employeeId, employeeName, department);
        setMonthlySalary(monthlySalary);
    }
    @Override
    public void calculateTax(){
        tax=(0.10*monthlySalary);
    }
    public void calculatePf(){
        pf=(0.15*monthlySalary);
    }
    
    @Override
    public String toString() {
        String head=String.format("%-10s  %-15s %-15s %-15s %-15s %-15s","EmployeeId","EmployeeName","Department","Salary","PF","Tax");
        String s=String.format("P%-10s %-15s %-15s %-15s %-15s %-15s",getId(),getName(),getDepartment(),monthlySalary,pf,tax);
        return head+"\n"+s;
    }
}

class ContractEmployee extends Employee{
    private Integer contractPeriod;
    private double contractAmount;
    private double tax;

    public void setContractPeriod(Integer contractPeriod) {
        this.contractPeriod = contractPeriod;
    }
    public void setContractAmount(double contractAmount) {
        this.contractAmount = contractAmount;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }
    public Integer getContractPeriod() {
        return contractPeriod;
    }

    public double getContractAmount() {
        return contractAmount;
    }

    public double getTax() {
        return tax;
    }

    public ContractEmployee(String employeeId, String employeeName, String department, Integer contractPeriod, double contractAmount) {
        super(employeeId, employeeName, department);
        this.contractPeriod = contractPeriod;
        this.contractAmount = contractAmount;
    }
    @Override
    public void calculateTax(){
        tax=(0.10*contractAmount);
    }
    @Override
    public String toString() {
        String head=String.format("%-10s  %-15s %-15s %-15s %-15s %-15s","EmployeeId","EmployeeName","Department","ContractPeriod","ContractAmount","Tax");
        String s=String.format("C%-10s %-15s %-15s %-15s %-15s %-15s",getId(),getName(),getDepartment(),contractPeriod,contractAmount,tax);
        return head+"\n"+s;
    }
}
public class Main {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the employee Id: ");
        String id=sc.next();
        if(Integer.parseInt(id)%2==0){
            System.out.print("Enter the Employee Name: ");
            String name=sc.next();
            System.out.print("Enter the Employee Department: ");
            String department=sc.next();
            System.out.print("Enter the Employee monthly salary: ");
            double salary=sc.nextDouble();
            System.out.println();
            PermanentEmployee obj=new PermanentEmployee(id,name,department,salary);
            obj.calculatePf();
            obj.calculateTax();
            System.out.println(obj.toString());
        }
        else{
            System.out.print("Enter the Employee Name: ");
            String name=sc.next();
            System.out.print("Enter the Employee Department: ");
            String department=sc.next();
            System.out.print("Enter the Employee Contract Period: ");
            Integer period=sc.nextInt();
            System.out.print("Enter the Employee Contract Amount: ");
            double amount=sc.nextDouble();
            ContractEmployee obj=new ContractEmployee(id,name,department,period,amount);
            obj.calculateTax();
            System.out.println(obj.toString());
        }

	}

}
