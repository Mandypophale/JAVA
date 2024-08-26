package interfacee;

public class AddMain {
	public static void main(String[] args) {
		
		Addable ab= ( a,  b)->{
			return a+b;
		};
		System.out.println(ab.add(3, 5));
			
		
		
		Addable sb=( a, b)->a-b;
		System.out.println(sb.add(6,3));
	}

}
