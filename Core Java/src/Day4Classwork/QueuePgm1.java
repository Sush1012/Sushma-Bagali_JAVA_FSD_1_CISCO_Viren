package Day4Classwork;

import java.util.PriorityQueue;

public class QueuePgm1 {

	public static void main(String[] args) {
PriorityQueue<String> q=new PriorityQueue<String>();
q.add("Greek");
q.add("Africa");
q.add("Denver");
q.add("France");
q.add("Brazil");
q.add("Canneda");
q.add("England");

System.out.println("Priority Queue elements are "+q);//may or may not be in order
System.out.println(q.poll());//removes 1st element in queue
System.out.println(q.poll());
q.add("India");
q.add("Tokiyo");
System.out.println("Priority Queue elements are "+q);
System.out.println(q.peek());
q.remove();
System.out.println("Priority Queue elements are "+q);







	}

}
