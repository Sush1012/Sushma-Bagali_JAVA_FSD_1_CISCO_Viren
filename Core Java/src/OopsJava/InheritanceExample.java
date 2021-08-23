package OopsJava;

class Animal{
	void eat() {
		System.out.println("Eating Chicken");
	}
}

class Dog extends Animal{
	void Bark() {
		System.out.println("Braking");
	}
}

class BabyDog extends Dog{
	void Sleep() {
		System.out.println("Sleeping");
	}
}




public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BabyDog B1=new BabyDog();
B1.eat();
B1.Bark();
B1.Sleep();
	}

}
