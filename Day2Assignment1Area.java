package OopsJava;

public class Day2Assignment1Area {
    
	int Area(int a,int b) {
    	 return (a+b);
     }
	
	float Area(float r) {
		float a=(float) (3.14*r*r);
		return a;
	}
	
	float Area(int l,float Br) {
		return (float) (l*Br);
	}
	
	
	public static void main(String[] args) {
		Day2Assignment1Area A=new Day2Assignment1Area();
		int A1=A.Area(2, 4);
		float A2=A.Area(3);
	    float A3=A.Area(2, 4.5f);
		System.out.println("Addition "+A1);
		System.out.println("Area of circle "+A2);
		System.out.println("Area of Reactangle "+A3);


	}

}
