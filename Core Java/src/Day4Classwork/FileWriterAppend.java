package Day4Classwork;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterAppend {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

//		Attach keyboard to datainputstream
		DataInputStream dis=new DataInputStream(System.in);
		
//		Attach file to fileoutputstream
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Hp\\Desktop\\interns\\Phase1",true);
		
		
		BufferedOutputStream bout=new BufferedOutputStream(fout,1024);
		System.out.println("enter text @ at the end");
		char ch;
		
		while((ch=(char)dis.read())!='@');
		{
			bout.write(ch);
		}
		bout.close();
	}

}
