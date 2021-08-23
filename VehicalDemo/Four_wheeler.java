package VehicalDemo;

public class Four_wheeler extends Vehicle  {
	int speed=4;
	long dist=8L;
	int nos_of_tyre=4;
	Four_wheeler(){
		
	}
	
	@Override
	void run() {
		System.out.println("Four Wheeler  class Vehicle is running");

	}
	
	@Override
	void stop() {
		System.out.println("Four Wheeler  class Vehicle stopped");

	}
	
	public void Disp() {
		System.out.println("Four Wheeler info "+speed+" "+dist+" "+nos_of_tyre);
		System.out.println("Parent Vehicle info "+super.speed+" "+super.dist);
	}
	
}
