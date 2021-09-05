package Day7Assignment;

abstract class pen{
	abstract void write();
	abstract void refill();
}
 class FountainPen extends pen{

	@Override
	void write() {
System.out.println("Writing...");		
	}

	@Override
	void refill() {
System.out.println("Refilled...");		
	}
	 void ChangeNib() {
		 System.out.println("Nib is changed");
	 }
 }

 
 class monkey{
	 void Jump() {
		 System.out.println("am in Jump method");
	 }
	 void Bite() {
		 System.out.println("am in Bite method");
	 }

		
	 
	
 }
 
 
 
 interface Animal{
	 abstract void eat();

	 
	 abstract void sleep();
	 
 }
 
class Human extends monkey implements Animal{

	@Override
	public void eat() {
		System.out.println("Am in eat method");		
		
	}

	@Override
	public void sleep() {
System.out.println("Am in sleep method");		
	}

 }
public class OOPs_Assignment3 {

	public static void main(String[] args) {

		monkey m;
		m=new Human();
		m.Bite();
		m.Jump();
        		
		
		
	}

}

