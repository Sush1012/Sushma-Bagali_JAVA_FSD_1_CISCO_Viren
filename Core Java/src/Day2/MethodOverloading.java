package Day2;

public class MethodOverloading {
	
	public static void area(int a,int b) {
		System.out.println("Area of triangle "+ (0.5*a*b));
	}
	
public static void area(long c) {
	System.out.println("Area of circle "+(3.14*c*c));

	}

public static void area(float f,int g ) {
	System.out.println("print value "+f+"----"+g);

}

public static void area(float i,int j,char k) {
	System.out.println("print value "+i+"-----"+j+"----"+k);

}

	public static void main(String[] args) {
    area(1,2);
    area(2L);
    area(3.2f,1);
    area(3.4f,1,'m');
	}

}
