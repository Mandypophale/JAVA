package abstraction;

public class Rectangle extends Shape {
	
	private double l;
	private double b;
	
	public Rectangle(double length, double breadth) {
		super();
		this.l = length;
		this.b = breadth;
	}

	@Override
	public double area() {
		return l*b;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(" Length of Rectangle is  : "+l);
		System.out.println(" Breadth of Rectangle is : "+b);
		System.out.println(" Area of Rectangle is    :"+area());
		
	}
	
	
	

}
