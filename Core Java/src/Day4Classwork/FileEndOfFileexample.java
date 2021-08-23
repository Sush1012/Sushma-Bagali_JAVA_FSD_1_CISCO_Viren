package Day4Classwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileEndOfFileexample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fin=new FileInputStream("C:\\Users\\Hp\\Desktop\\interns\\Phase1");
		
System.out.println(fin.getChannel());
System.out.println("number of bytes read: "+fin.available());

	int ch;
	while((ch=fin.read())!=-1)
		System.out.print((char)ch);
	
	fin.close();
	}

}
