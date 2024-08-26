package polymorphism;

public class SavingAcc extends Account{

	private double balance;

	public SavingAcc(int accNo, String accName, double balance) {
		super(accNo, accName);
		this.balance = balance;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println("Account Balance is"+balance);
		
	}
	
}
