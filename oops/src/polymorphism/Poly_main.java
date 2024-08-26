package polymorphism;

public class Poly_main {
	public static void main(String[] args) {
		
	
	/*Employee emp=new Employee();
	System.out.println("Salary from Employee class :"+emp.calculateSalary());
	
	Manager man=new Manager();
	System.out.println("salary of Manager : "+man.calculateSalary());*/
		
		Manager m=new Manager(123,"Mandy",54000,6000,4500,3400);
		m.printinfo();
		System.out.println("-----------------------------------");
		SalesExe s= new SalesExe(234,"xyz",50000,5000,4000,3400,4300);
		s.printinfo();
		
	}
}