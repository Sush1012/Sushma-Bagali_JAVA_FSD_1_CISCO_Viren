package VehicalDemo;

public class TwoWheeler  extends Vehicle{
	int speed=2;
	long dist=4L;
	int nos_of_tyre=2;
	TwoWheeler(){
		
	}
	@Override
	void run() {
		System.out.println("TwoWheeler  class Vehicle is running");

	}
	@Override
	void stop() {
		System.out.println("TwoWheeler  class Vehicle stopped");

	}
	
	
	public void Disp() {
		System.out.println("TwoWheeler info "+speed+" "+dist+" "+nos_of_tyre);
		System.out.println("Parent Vehicle info "+super.speed+" "+super.dist);
	}
	

}
