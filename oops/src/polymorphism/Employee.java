package polymorphism;

public class Employee {
	
	
	private int empId;
	private String empName;
	private int basicSal;
	private double hra;
	private double da;
	
	
	public Employee(int empId, String empName, int basicSal, double hra, double da) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSal = basicSal;
		this.hra = hra;
		this.da = da;
	}


	public double calculateSalary() {
		return basicSal+hra+da;
	}
	
	public void printinfo() {
		System.out.println("Employee ID :"+empId);
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee house rent allowance :"+hra);
		System.out.println("Employee dearness allowance :"+da);
		
		
	}
}
