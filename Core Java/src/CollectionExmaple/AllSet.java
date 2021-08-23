package CollectionExmaple;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class AllSet {

	public static void main(String[] args) {
LinkedHashSet<String> Lhs=new LinkedHashSet<String>();
HashSet<String> Hs=new HashSet<String>();
TreeSet<String> Ths=new TreeSet<String>();
Lhs.add("d");
Lhs.add("c");
Lhs.add("True");
Lhs.add("45");
Lhs.add("Jessi");

Hs.add("Mango");
Hs.add("Cherry");
Hs.add("Pineapple");
Hs.add("Kiwi");
Hs.add("Grapes");

Ths.add("India");
Ths.add("Denver");
Ths.add("Tokiyo");
Ths.add("Europe");
Ths.add("London");

System.out.println("I am Linkedhashset :) "+Lhs);
System.out.println("Size of LinkedHashset is "+Hs.size());
System.out.println("Jessi! are you there? "+Lhs.contains("Jessi"));
System.out.println("d is removed! "+Lhs.remove("d"));
System.out.println("Nick is added! "+Lhs.add("Nick"));
System.out.println("Linkedhasset! are you empty? "+Lhs.isEmpty());
Lhs.clear();
System.out.println(Lhs.getClass());
System.out.println("Finally I am Linkedhashset :( "+Lhs);

System.out.println("I am Hashset :) "+Hs);
System.out.println("Size of Hashset is "+Hs.size());
System.out.println("Grapes! are you there "+Hs.contains("Grapes"));
System.out.println("Grapes is removed "+Hs.remove("Grapes"));
System.out.println("Apple is added! "+Hs.add("Apple"));
System.out.println("Hashset! Are you empty ?"+Hs.isEmpty());
Hs.clear();
System.out.println(Hs.getClass());
System.out.println("Finally I am Hashset :( "+Hs);


System.out.println("I am Treeset:) "+Ths);
System.out.println("Size of Tree Hashset is "+Ths.size());
System.out.println("India is there? "+Ths.contains("India"));
System.out.println("Europe is there? "+Ths.remove("Europe"));
System.out.println("Brazil is added! "+Ths.add("Brazil"));
System.out.println("Treeset! are you Empty? "+Ths.isEmpty());
Ths.clear();
System.out.println("Finally I am Treeset :( "+Ths);
System.out.println(Ths.getClass());

	}

}
