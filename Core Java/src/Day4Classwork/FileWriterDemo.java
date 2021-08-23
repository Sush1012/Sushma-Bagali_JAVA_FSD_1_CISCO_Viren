package Day4Classwork;
import java.io.FileWriter;
import java.util.Scanner;
public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Str=new Scanner(System.in);
System.out.println("Enter the input lines");
String S=Str.nextLine();
System.out.println(S);
try {
	FileWriter o=new FileWriter("C:\\Users\\Hp\\Desktop\\interns\\Phase1");

			o.write(S);
	System.out.println("Data  is written ");
	o.close();

}
catch (Exception e) {
e.getStackTrace();
}

	}

}
