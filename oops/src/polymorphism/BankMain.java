package polymorphism;

public class BankMain {
	public static void main(String[] args) {
		
		FdAcc fd=new FdAcc (012,"mandy",15000,4);
		fd.printInfo();
		
		System.out.println("--------------------------------------");
		SavingAcc ac=new SavingAcc(013,"xyz",34500);
		ac.printInfo();
	}

}