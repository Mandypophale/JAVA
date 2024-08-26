package practice;

public class Computer {
	
	public static void main(String[] args) {
		
		Cpu c=new Cpu(200,new Ram(100,24));
		System.out.println(c);
	}

}
