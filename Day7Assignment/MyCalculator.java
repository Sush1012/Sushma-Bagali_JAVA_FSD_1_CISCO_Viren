package Day7Assignment;

import java.util.Scanner;


public class MyCalculator {
	
	long Power(int n,int p) throws Invalid_n_p_Exception {
	long res=1;
	if(n<0 || p<0)
		throw new Invalid_n_p_Exception("n or p should not be negative");
	else if(n==0 && p==0)
		throw new Invalid_n_p_Exception("n and p should not be Zero");
	else {
		for(int i=1;i<=p;i++) {
			res=res*n;
		}
	}
    return res ;
		
	}

	public static void main(String[] args) {

		Scanner S1= new Scanner(System.in);
		
		System.out.println("Enter the n value" );
		int n=S1.nextInt();
		System.out.println("enter the p value");
		int p=S1.nextInt();
		
		MyCalculator obj=new MyCalculator();
		try {
		long res=obj.Power(n, p);
		System.out.println(n+" to the power of "+p+" is "+res);

		}catch(Exception e){
			System.out.println("Exception occured "+e.getMessage());
		}
	}

}
class Invalid_n_p_Exception extends Exception{
	Invalid_n_p_Exception(String s){
		super(s);
	}
}
