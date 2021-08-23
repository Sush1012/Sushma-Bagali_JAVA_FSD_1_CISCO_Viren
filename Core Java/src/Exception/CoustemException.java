package Exception;

public class CoustemException {
	
	static void validate(int age) throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("Not Valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String[] args) {
try {
	validate(17);
}
catch(Exception m) {
	System.out.println("Exception Occure: "+m.getMessage());
}
System.out.println("rest of code...");
	}

}

class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
		super(s);
	}
}
