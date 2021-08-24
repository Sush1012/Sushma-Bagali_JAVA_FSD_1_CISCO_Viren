package Day6;

public class Thread_Example extends Thread {
	
	public void run() {
		for (int i = 0; i <5; i++) {
			
		
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
             System.out.println(e);		
            }
		System.out.println(Thread.currentThread().getName()+" :"+i);
	}
	}
	
	public static void main(String[] args) {
Thread_Example t1=new Thread_Example();
t1.setName("Java");
t1.setPriority(MAX_PRIORITY);

Thread_Example t2=new Thread_Example();
t2.setName("Python");

Thread_Example t3=new Thread_Example();
t3.setName("Oracle");

Thread_Example t4=new Thread_Example();
t4.setName("C++");

t1.start();
t2.start();
t3.start();
t4.start();

System.out.println(t1.getState());
System.out.println(t2.getState());
System.out.println(t3.getState());
System.out.println(t2.getState());

	}

}
