package Day2;

public class Constructer {
	
	int id;
	String name;
	
	public Constructer() {
		id=100;
		name="Sush";
		System.out.println("I am constructer");
	}
	
	public Constructer(int i, String string) {
		// TODO Auto-generated constructor stub
System.out.println(i+" "+string);
	}

	void disp() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		Constructer s1=new Constructer();
		Constructer s2=new Constructer();
		
		Constructer s3=new Constructer(111,"Appi");
		Constructer s4=new Constructer(222,"Nick");
		s1.disp();
		s2.disp();

	}
}
