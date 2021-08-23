package Day4Classwork;

import java.io.FileReader;

public class FileReasDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char array[]=new char[50];
try {
	FileReader input=new FileReader("C:\\Users\\Hp\\Desktop\\interns\\phase1");
	
	input.read(array);
	System.out.println("data is the file");
System.out.println(array);
input.close();
}
catch (Exception e) {
e.getStackTrace();
}
	}

}
