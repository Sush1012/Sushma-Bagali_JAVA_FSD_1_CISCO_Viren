package Day6;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer s=new StringBuffer("Hello");
s.append("sush");
System.out.println(s);

s.insert(9, "Bagali");
System.out.println(s);

s.replace(5, 8,"Sushmaa");
System.out.println(s);

s.reverse();
System.out.println(s);

s.delete(4, 9);
System.out.println(s);

System.out.println(s.charAt(0));

System.out.println(s.length());
	}

}
