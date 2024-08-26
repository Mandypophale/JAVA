package polymorphism;



public class Account  {
	
	private int accNo;
	private String accName;
	
	public Account(int accNo, String accName) {
		super();
		this.accNo = accNo;
		this.accName = accName;
	}
	
	public void printInfo() {
		System.out.println("Account Number is : "+accNo);
		System.out.println("Account Holdername is "+accName);
	}
	
}
