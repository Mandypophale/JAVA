package interfacee;

public class Tv implements RemoteDevice{

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println("Tv is On");
	}

	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		System.out.println("TV is Off");
	}

}
