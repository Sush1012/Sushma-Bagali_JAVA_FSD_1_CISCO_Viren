package Day6;

class Table{
	void printtable(int n) {
		System.out.println("I am into this printtable method");
		
		synchronized(this) {//synchronised blk
			for (int i = 1; i <6; i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(400);
				}catch (Exception e) {
					System.out.println(e);
				}
			}
		}//end blk
		
	}//end method
}

class MyThread1 extends Thread{
	Table t;
	public MyThread1(Table t) {
		// TODO Auto-generated constructor stub
		this.t=t;
	}
	public void run() {
		System.out.println("Into the Mythread1 run() method");
		t.printtable(5);
	}
}

class MyThread2 extends Thread{
	Table t;
	public MyThread2(Table t) {
		// TODO Auto-generated constructor stub
		this.t=t;
	}
	public void run() {
		System.out.println("Into the Mythread2 run() method");
		t.printtable(100);
	}
}



public class TestSynchronisedBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj=new Table();
		
     MyThread1 m1=new MyThread1(obj);
     MyThread2 m2=new MyThread2(obj);
     
     m1.start();
     m2.start();

	}

}
