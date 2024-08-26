package inhertance;

public class Employee {
	
	private int basicSal=23000;
	private double hra=5600;
	private double da=3400;
	
	public double calSalary() {
		return basicSal+hra+da;
	}
	
}
