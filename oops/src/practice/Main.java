package practice;

public class Main {
	public static void main(String[] args) {
		
		Student s=new Student();
		 System.out.println(s);
		System.out.println(); 
		
		 
		 Customer c=new Customer(11,"Mandar","Mobile", new Mydate(2,7,24));
		c.printinfo();
		 
		 
	}
}
