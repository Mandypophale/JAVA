package practice;

public class Mydate {
	
	private int day;
	private int month;
	private int year;
	
	
	public Mydate() {
		day=17;
		month=10;
		year=2024;
		
	}
	public Mydate(int d, int m, int y) {
		day=d;
		month=m;
		year=y;
		
	}
	@Override
	public String toString() {
		return "Mydate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}

