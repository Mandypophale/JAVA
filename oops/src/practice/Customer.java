package practice;

public class Customer extends Mydate {
	
	private int cusId;
	private String custName;
	private String prodName;
	private Mydate deliveryDate;
	
	public Customer(int cusId, String custName, String prodName, Mydate deliveryDate) {
		super();
		this.cusId = cusId;
		this.custName = custName;
		this.prodName = prodName;
		this.deliveryDate = deliveryDate;
	}
	
	void printinfo() {
		System.out.println("Customer id is :"+cusId);
		System.out.println("Customer Name is :"+custName);
		System.out.println("Product Name is:"+prodName);
		System.out.println("Delivery date is :"+deliveryDate);
		
	}
	
	

}
