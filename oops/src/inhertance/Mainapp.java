package inhertance;

public class Mainapp {
	
	public static void main(String[] args) {
		
		//Employee is parent class
		Employee e=new Employee();
		e.calSalary();
		 
		System.out.println();
		
		
		Manager  m=new Manager();
		
		//child class obj accessing parent class method.
		double sal=m.calSalary();
		//Child class obj accessing child class method.
		double inc=m.calInc();
		
		
		System.out.println("Total salary of manager:"+(sal+inc));
		
	}
}	
