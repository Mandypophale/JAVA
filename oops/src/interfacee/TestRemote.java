package interfacee;

public class TestRemote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteDevice d=new DvdPlayer();
		
		d.switchOn();
		d.switchOff();
		
		System.out.println("------------------");
		
		RemoteDevice r=new Tv();
		r.switchOn();
		r.switchOff();
	}

}
