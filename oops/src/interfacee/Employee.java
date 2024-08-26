package interfacee;

public class Employee implements  Cloneable, Printable {
		
	private int empId;
	private String empName;
	private int basicSal;
	private double hra;
	private double da;
	
	
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, int basicSal, double hra, double da) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSal = basicSal;
		this.hra = hra;
		this.da = da;
		
		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(int basicSal) {
		this.basicSal = basicSal;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", basicSal=" + basicSal + ", hra=" + hra + ", da="
				+ da + "]";
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Employee ID :"+empId);
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee house rent allowance :"+hra);
		System.out.println("Employee dearness allowance :"+da);
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
}
