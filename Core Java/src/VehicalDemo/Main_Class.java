package VehicalDemo;

public class Main_Class {

	public static void main(String[] args) {
//		new Vehicle().run();
//		new Vehicle().stop();
//		new Vehicle().fuel(1);
//		new Vehicle().fuel('A', 2);
//		new Vehicle().fuel(2f, "Sush");
//		new TwoWheeler().run();
//		new TwoWheeler().stop();
//		new TwoWheeler().Disp();
//		new Three_Wheeler().run();
//		new Three_Wheeler().stop();
//		new Three_Wheeler().Disp();
//		new Four_wheeler().run();
//		new Four_wheeler().stop();
//		new Four_wheeler().Disp();
//		new Eight_Wheeler().run();
//		new Eight_Wheeler().stop();
//		new Eight_Wheeler().Disp();
		
		// 
		Vehicle v;
		v=new TwoWheeler();
		v.run();
		v.stop();
		v.Disp();
	v=new Three_Wheeler();
	v.run();
	v.stop();
	v.Disp();
	v=new Four_wheeler();
	v.run();
	v.stop();
	v.Disp();
	v=new Eight_Wheeler();
	v.run();
	v.stop();
	v.Disp();

	}

}
