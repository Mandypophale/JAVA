package polymorphism;

public class FdAcc extends Account{
	private double amount;
	private float duration;
	public FdAcc(int accNo, String accName, double amount, float duration) {
		super(accNo, accName);
		this.amount = amount;
		this.duration = duration;
	}
	 @Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println("Fd amount is :"+amount);
		System.out.println("Fd duration is: "+duration);
	}

}
