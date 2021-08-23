package Exception;

import java.io.IOException;
import java.util.Scanner;

public class Checked_Unckecked {

	static int add(int n1,int n2) throws  IOException {
		if(n1>100) {
			throw new ArithmeticException("N1 is greater then 100,hence execption is thrown");
		}
		else {
		throws new IOException("N1 is Not Greater then 100,hence excetion is thrown");
		}
		return n1+n2;
	}
	
	public static void main(String[] args) {
		int res=0;
		Scanner Scn1=new Scanner(System.in);
		
		System.out.println("Enter n1");
		int n1=Scn1.nextInt();
		
		System.out.println("Enter n2");
		int n2=Scn1.nextInt();
		
		
		try {
			res=add(n1,n2);
			System.out.println("change");
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		System.out.println("Result is "+res);
	}

}
