package practice;



public class Student extends Mydate {
	
	private int studentId;
	private String studentName;
	private Mydate AdmisDate;
	
	public Student(int studentId, String studentName, Mydate admisDate) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		AdmisDate = admisDate;
	}
	
	public Student() {
		studentId=1022;
		studentName="Mandar";
		AdmisDate=new Mydate();
		
	}
	
	
	
}
