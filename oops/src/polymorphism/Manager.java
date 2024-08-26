package polymorphism;

public class Manager extends Employee {
	
	private double inc;

		
	


	public Manager(int empId, String empName, int basicSal, double hra, double da, double inc) {
		super(empId, empName, basicSal, hra, da);
		this.inc = inc;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return super.calculateSalary()+inc;
	}
	
	@Override
	public void printinfo() {
		// TODO Auto-generated method stub
		super.printinfo();
		System.out.println("Manager Incentive : "+inc);
		System.out.println("Total Salary for Manager is  :"+calculateSalary());
	}
	
	
	
}
