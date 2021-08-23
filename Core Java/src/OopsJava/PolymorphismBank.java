package OopsJava;


class Bank{
	float getRateOfIntrest() {
		return 0;
	}
}

class HDFC extends Bank{
	float getRateOfIntrest() {
		return 3.0f;
	}
}

class Axis extends Bank{
	float getRateOfIntrest() {
		return 4.0f;
	}
}

class Baroda extends Bank{
	float getRateOfIntrest() {
		return 5.0f;
	}
}



public class PolymorphismBank {


	public static void main(String[] args) {
		Bank b;
		b = new HDFC();
		System.out.println("HDFC rate of intrest "+ b.getRateOfIntrest());
		
		b=new Axis();
		System.out.println("Axis rate of intrest "+ b.getRateOfIntrest());

		b=new Baroda();
		System.out.println("Baroda rate of intrest "+ b.getRateOfIntrest());

	}

}
