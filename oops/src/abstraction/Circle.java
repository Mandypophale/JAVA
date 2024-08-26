package abstraction;

public class Circle extends Shape {
	
	private  final double pi=3.14;
	private double r;
	
	
	public Circle(double r) {
		super();
		this.r = r;
	}


	@Override
	public double area() {
		
		return pi*(r*r);
	}
	public double circum() {
		return 2*pi*r;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Radius of Circle is : "+r);
		System.out.println("Area of Circel is   :"+area());
		
	}
	

	

}
