package interfacee;

public class DvdPlayer implements RemoteDevice {

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println("DVD is On");
	}

	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		System.out.println("Dvd is Off");
	}

}
