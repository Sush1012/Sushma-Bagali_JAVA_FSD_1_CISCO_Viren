package cisco.java.programs;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int to long
		int i=10;
		long l=i;
		System.out.println("int to long "+l);
		
//		long to int
		int i2=(int)l;
		System.out.println("long to int "+i2);
		
//		double to float
		double d=1234565487.456545465;
		float f= (float)d;
		System.out.println("double = "+d);
		System.out.println("D to F "+f);
		
//		double long int
		double d2=100.04;
		long l2=(long)d2;
		int i3=(int)d2;
		System.out.println("D to L "+l2);
		System.out.println("D to i "+i3);
		
//		float to long
		float  f3=l;
		System.out.println("f to L "+f3);
		
//		byte int double
		
		byte b;
		int ii=255;
		double dd=323.44;
//		int to byte
		b= (byte)ii;
		System.out.println(" int to byte "+b);
		b=(byte)dd;
		System.out.println("double to byte "+b);


		
		

	}

}
