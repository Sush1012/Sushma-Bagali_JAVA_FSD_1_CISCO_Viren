package Day4Classwork;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Map<Integer,String> m=new LinkedHashMap<Integer, String>();
 m.put(1, new String("Samsung"));
 m.put(2, new String("Sony"));
 m.put(3, new String("mi"));
 m.put(4, new String("onepluse"));
 m.put(5, new String("iphone"));
 
 System.out.println("My linkedhashmap is "+m);

 for(Integer key: m.keySet()) {
	 System.out.println(key +":"+m.get(key));
 }
	}

}
