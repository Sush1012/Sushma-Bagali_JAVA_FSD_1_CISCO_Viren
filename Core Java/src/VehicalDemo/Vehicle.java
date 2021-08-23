package VehicalDemo;

public class Vehicle {
	int speed=5;
	long dist=10L;
	
	 Vehicle(){
		
	}
     Vehicle(int speed,long dist){
		this.speed=speed;
		this.dist=dist;
	}
	void run() {
		System.out.println("Parent class Vehicle is running");

	}
	
	void stop() {
		System.out.println("Parent class Vehicle stopped");

	}
	
	public void fuel(int a) {
		System.out.println("I am method1 Parent class");

	}
	
public void fuel(float f,String s) {
		System.out.println("I am method2 Parent class");
	}

public void fuel(char ch,int i) {
	System.out.println("I am method3 of Parent class");

}
public void Disp() {
	
}
	
}
