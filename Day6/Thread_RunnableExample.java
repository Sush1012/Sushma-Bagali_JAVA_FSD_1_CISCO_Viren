package Day6;

public class Thread_RunnableExample implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
Thread_RunnableExample r=new Thread_RunnableExample();
Thread t=new Thread(r);
t.start();
}
	}

	


