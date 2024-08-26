package polymorphism;

public class SalesExe extends Manager {
	
	private double travelAllow;

	public SalesExe(int empId, String empName, int basicSal, double hra, double da, double inc, double travelAllow) {
		super(empId, empName, basicSal, hra, da, inc);
		this.travelAllow = travelAllow;
	}
	
	
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return super.calculateSalary()+travelAllow;
	}
	
	@Override
	public void printinfo() {
		// TODO Auto-generated method stub
		super.printinfo();
		System.out.println("Tavel Allowance : "+travelAllow);
		System.out.println("Total Salary for Sales Executive is : "+calculateSalary());
	}
	
	

}
