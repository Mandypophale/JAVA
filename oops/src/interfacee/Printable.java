package interfacee;

public interface Printable {
	 int a=0;
	  void print();
	  static void demoprint() {
		  System.out.println("Demo Print method From the Interface");
	  }
	  
	  default void print11() {
		  System.out.println("Deefault method From the Interface");
	  }
}
