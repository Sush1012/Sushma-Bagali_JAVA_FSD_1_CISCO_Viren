package Exception;

public class SalaryCostumexception {

	static void salary(int s) throws SalaryException{
		if(s<2000)
			throw new SalaryException("You need to work hard");
		else if(s>2100 ||s<=5000) {
			throw new SalaryException("Your salary is somehow good");
		}
		else if(s>=5100 ||s<=9000) {
		throw new SalaryException("You salary is good");
	}
	}
		

	public static void main(String[] args) {
try {
	salary(9000);
}
catch(Exception m) {
	System.out.println("Exception Occured: "+m.getMessage());
}
System.out.println("rest of code...");
	}


}

class  SalaryException extends Exception{
	SalaryException(String s){
		super(s);
	}
}



