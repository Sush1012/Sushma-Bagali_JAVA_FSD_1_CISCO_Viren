package AbstractEg;


abstract class Bike{
	Bike(){
		System.out.println("I am Bike");
	}
	abstract void run();
	void changeGear() {
		System.out.println("gear is changed");
	}
}


abstract class Honda extends Bike{
	abstract void run();
	abstract void run1();

}


class Hello extends Honda{
	 void run() {
		System.out.println("running successfully");
	}
	 
	 void run1() {
			System.out.println("running successfully");
		}

}
public class AbstractEg2 {

	public static void main(String[] args) {
Honda obj=new Hello();
obj.run();
obj.run1();
obj.changeGear();
	}

}
