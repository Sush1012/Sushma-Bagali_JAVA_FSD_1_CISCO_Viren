package Day2;

public class ConstructerOverloading {
	int age=10;
	String name;
	long id;
	
	ConstructerOverloading(){
		System.out.println("No parameter");
	}
	
	ConstructerOverloading(int age,String name,long id){
 age=25;
 name="Sushma";
 id=100;
	}
	
	ConstructerOverloading(int age,String name){
		 age=age;
		 name=name;
		
			}
	void disp() {
		System.out.println(age+" "+name+" "+id);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructerOverloading s1=new ConstructerOverloading(10,"Arya");
		ConstructerOverloading s2=new ConstructerOverloading(11,"Nikkat",213);
s1.disp();
s2.disp();
	}

}
