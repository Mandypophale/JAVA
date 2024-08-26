package abstraction;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		/*Shape s=new Circle(30);
		System.out.println("Area of Circle is :"+s.area());
		
		Rectangle r=new Rectangle(4,5);
		System.out.println("Area of Rectangle :"+r.area());
		
		Square sq=new Square(3);
		System.out.println("Area of square :"+sq.area()); */
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println();
		System.out.println("			Choose the Shape");
		System.out.println();
		
		System.out.println("1.Circle		2.Rectangle			3.Square");
		int op=sc.nextInt();
		
		if(op==1) {
			
			System.out.println("You choose Circle");
			System.out.println();
			System.out.println("Enter the radius");
			double c=sc.nextDouble();
			Shape cr=new Circle(c);
			Circle  cc=(Circle)cr;
			cr.print();
			System.out.println ("Circumference is "+cc.circum());
		
			
		}else if(op==2) {
			
			System.out.println("You choose Rectangle");
			System.out.println();
			
			System.out.println("Enter the length");
			double l=sc.nextDouble();
			System.out.println("Enter the Breadth");
			double b=sc.nextDouble();
			
			Rectangle r=new Rectangle(l,b);
			
			r.print();
			
		}else if(op==3) {
			System.out.println("You Choose Square");
			System.out.println();
			double s=sc.nextDouble();
			Square sr=new Square(s);
			
			sr.print();
			}
		else {
			System.out.println("Please Choose Appropriate Option");
		}
		
		
		
	
	}

}
