package Day6;
import java.io.*;

class Line{
	synchronized public void getLine() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName()+" :"+i);
			try {
				Thread.sleep(400);
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}

		}
	}
	
	
}

class Train extends Thread{
//	creat ref of Line's obj
	Line line; 
	
	public Train(Line line) {
    this.line=line;
    }
	@Override
	public void run() {
		line.getLine();
	}
}

public class Synchronised_TrainExample {

	public static void main(String[] args) {
//object of line cls tht shared among threads
		Line obj=new Line();
		
//		creating threads threads tht r sharing the same obj
		Train T1=new Train(obj);
		Train T2=new Train(obj);

		T1.setName("Train 1");
		T2.setName("Train 2");
		
		T1.start();
		T2.start();

	}

}
