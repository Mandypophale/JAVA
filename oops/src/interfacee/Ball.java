package interfacee;

public class Ball implements Bounceable, Movable {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Ball is bouncing");
	}

	@Override
	public void bounce() {
		// TODO Auto-generated method stub
		System.out.println("Ball can bounce");
	}

}
