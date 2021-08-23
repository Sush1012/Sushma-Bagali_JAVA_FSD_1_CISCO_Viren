package Exception;

public class TrycatchExample1 {
	

	public static void main(String[] args) {
		int a[]=new int[5];
try {
	checkExceptio();
 a[6]=10;
}

finally {
	System.out.println("Finnlly outside method");
}

	}

	private static void checkExceptio() {
try {
	int r=5/0;
	
}
catch (ArithmeticException e) {
System.out.println("Airthemetic exception");
}
finally {
	System.out.println("Finally inside method");
}
	}

}
