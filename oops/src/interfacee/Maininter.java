package interfacee;

public class Maininter {
	public static void main(String[] args)  {
		
		Printable p=new Employee();
		p.print();
		System.out.println("--------------------------------------------");
		
		Employee e=new Employee();
		try {
			e.clone();
			System.out.println(e);
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		System.out.println("------------------------------------------------");
			p.print11();
		
		//syntax For Accessing Static Method from Interface
	//	Interface_name And Method Name
		
		Printable.demoprint();
		
		Printable r=new Rectangle();
		r.print();
		
	}

}
