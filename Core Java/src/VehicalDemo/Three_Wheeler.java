package VehicalDemo;

public class Three_Wheeler extends Vehicle {
	int speed=3;
	long dist=6L;
	int nos_of_tyre=3;
	Three_Wheeler(){
		
	}
	
	
	@Override
	void run() {
		System.out.println("Three Wheeler  class Vehicle is running");

	}
	
	void stop() {
		System.out.println("Three Wheeler  class Vehicle stopped");

	}
	
	public void Disp() {
		System.out.println("ThreeWheeler info "+speed+" "+dist+" "+nos_of_tyre);
		System.out.println("Parent Vehicle info "+super.speed+" "+super.dist);
	}
	

}
