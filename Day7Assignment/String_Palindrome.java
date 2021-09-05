package Day7Assignment;

import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {
		String input=" ";
		Scanner S1= new Scanner(System.in);
		System.out.println("Enter the String to check");
		input=S1.nextLine();
		if(input.length()<50) {
		String_Palindrome obj=new String_Palindrome();
		boolean res=obj.Palindrome(input);
		if(res==true) {
			System.out.println(input+"  is palindrome");
		}else {
			System.out.println(input+" is not a palindrome");

		}
		}
		else {
			System.out.println("OOps!!! your input exceded the limit of its length");
		}
	

	}

	private boolean Palindrome(String input) {
		String rev="";
		for(int i=input.length()-1;i>=0;i--) {
			rev=rev+input.charAt(i);
		}
		if(rev.equals(input)) {
			return true;
		}
		else
			return false;
			
        }

}
