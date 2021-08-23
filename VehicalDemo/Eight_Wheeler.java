package VehicalDemo;

public class Eight_Wheeler extends Vehicle{
	int speed=6;
	long dist=12L;
	int nos_of_tyre=8;
	Eight_Wheeler(){
		
	}
	
	void run() {
		System.out.println("Eight Wheeler  class Vehicle is running");

	}
	
	void stop() {
		System.out.println("Eight Wheeler  class Vehicle stopped");

	}
	
	public void Disp() {
		System.out.println("Eight Wheeler info "+speed+" "+dist+" "+nos_of_tyre);
		System.out.println("Parent Vehicle info "+super.speed+" "+super.dist);
	}
	
}
