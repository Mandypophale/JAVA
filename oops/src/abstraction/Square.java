package abstraction;

public class Square extends Shape {
	
	private double s;

	public Square(double s) {
		super();
		this.s = s;
	}

	@Override
	public double area() {
		
		return s*s;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(" Side of square is : "+s);
		System.out.println(" Area of square is : "+area());
	}
	
	

}
