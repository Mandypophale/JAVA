package practice;

public class Cpu {
	
	
	private int storage;
	private Ram ram;
	
	public Cpu() {
		super();
	}

	public Cpu(int storage, Ram ram) {
		super();
		this.storage = storage;
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Cpu [storage=" + storage + ", ram=" + ram + "]";
	}
	
	

	
	
	
	
}
