package Day4Assignment;

public class DiffBtwEqualTypes {

	public static void main(String[] args) {
String t="Dehli";
String o="Mumbai";
String k="dehli";
String y=new String("Mumbai");
String l=new String("delhi");
String p=new String("Hello");

if(o==l) {
	System.out.println("truee.");
}
else {
	System.out.println("false.");
}

if(y==p) {
	System.out.println("truee.");
}
else {
	System.out.println("false.");
}

if(t==o) {
	System.out.println("truee.");
}
else {
	System.out.println("false.");
}



if(k==y) {
	System.out.println("truee.");
}
else {
	System.out.println("false.");
}

if(p==y) {
	System.out.println("truee.");
}
else {
	System.out.println("false.");
}
//-----------By using equals method--------

if(o.equals(l)) {
	System.out.println("truee!");
}
else {
	System.out.println("false!");
}

if(y.equals(p)) {
	System.out.println("truee!");
}
else {
	System.out.println("false!");
}

if(t.equals(o)) {
	System.out.println("truee!");
}
else {
	System.out.println("false!");
}

if(k.equals(y)) {
	System.out.println("truee!");
}
else {
	System.out.println("false!");
}

if(p.equals(y)) {
	System.out.println("truee!");
}
else {
	System.out.println("false!");
}


}

}
