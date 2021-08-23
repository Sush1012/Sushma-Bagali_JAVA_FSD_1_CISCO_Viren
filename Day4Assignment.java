package CollectionExmaple;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class Day4Assignment {

	public static void main(String[] args) {
LinkedHashSet L1=new LinkedHashSet();
LinkedHashSet<Integer> L2=new LinkedHashSet<Integer>();
TreeSet<String> T=new TreeSet<String>();

Scanner S=new Scanner(System.in);
L1.add(1);
L1.add(2);
L1.add('A');
L1.add('B');
L1.add(1.2);
L1.add(2.1);
L1.add(true);
System.out.println("I am Linked hashset1 :) "+L1);

System.out.println("Enter L2 Elements");
for(int i=1;i<9;i++) {
	L2.add(S.nextInt());
}
System.out.println("I am Linked hashset1 :)  "+L2);


T.add("java");
T.add("C");
T.add("C++");
T.add("Python");
T.add("javascript");
T.add("pearl");
System.out.println("I am Treehashset :)  "+T);
System.out.println("C is removed! "+T.remove("C"));
System.out.println("C++ is removed! "+T.remove("C++"));
System.out.println("SQL is in! "+T.add("SQL"));
System.out.println("PHP is in! "+T.add("PHP"));
System.out.println("Java! are you present? "+T.contains("java"));
T.clear();
System.out.println("Treset Now :( "+T);



	}

}
