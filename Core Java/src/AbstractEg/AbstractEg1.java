package AbstractEg;

abstract class BasicAbstractEg{

	private String name="Quin";
	BasicAbstractEg(){
		System.out.println("I am Abstract Constructer");
	}
	
	public void myMethod() {
		System.out.println("Hello "+name);
	}
	abstract public void anotherMethod();
}

 public class   AbstractEg1 extends BasicAbstractEg{
	
	 AbstractEg1(){
		super();
		System.out.println("I am Child constructer");
	}
	
	public void anotherMethod() {
		System.out.println("I am Abstract method");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicAbstractEg obj=new AbstractEg1();
		obj.anotherMethod() ;
		obj.myMethod();
	}

}
