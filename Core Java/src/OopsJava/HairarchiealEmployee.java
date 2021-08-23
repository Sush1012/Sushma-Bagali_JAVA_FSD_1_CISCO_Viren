package OopsJava;


	    class Employee{
		int bonus=1000;
		float sal=25000.0f;
		
		void show() {
			System.out.println("I am in Parent class");
		}
		
		void disp() {
			System.out.println("I am in Parent class");
		}
	}
	
	public class HairarchiealEmployee extends Employee{
		
		int bonus=1500;
		void show() {
			System.out.println("Bonus is "+ super.bonus);
			System.out.println("I am Child Class");
		}
		
		
	public static void main(String[] args) {
		HairarchiealEmployee Ch=new HairarchiealEmployee();
		
		System.out.println(" bonus is "+Ch.bonus);
		System.out.println("Salary is "+Ch.sal);
	Ch.show();
	Ch.disp();
	
	}

}
