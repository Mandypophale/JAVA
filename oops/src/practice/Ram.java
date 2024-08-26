package practice;

public class Ram extends  Cpu {
	
	private int capacity;
	private double speed;
	
	@Override
	public String toString() {
		return "Ram [capacity=" + capacity + ", speed=" + speed + "]";
	}

	public Ram(int capacity, double speed) {
		super();
		this.capacity = capacity;
		this.speed = speed;
	}
	
	
}
