package interfacee;

public class InterfaceMain {
		
	public static void main(String[] args) {
		
		Ball b=new Ball();
		b.bounce();
		b.move();
		
		System.out.println("---------------");
		
		Car c=new Car();
		c.move();
	}
}
