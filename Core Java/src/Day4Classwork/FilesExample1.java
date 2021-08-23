package Day4Classwork;

import java.io.File;
import java.io.IOException;

public class FilesExample1 {

	public static void main(String[] args) {
try {
	File file=new File("C:\\Users\\Hp\\Desktop\\interns\\Newfile");
	
	if(file.createNewFile()) {
		System.out.println("New file is created");
	}else {
		if(file.exists()) {
			System.out.println("file already exits");
			System.out.println("file path: "+file.getAbsolutePath());
			System.out.println("file name "+file.getName());
			System.out.println("file class "+file.getClass());
			System.out.println("file parent "+file.getParent());
			System.out.println("file space allocated "+file.getUsableSpace());
			System.out.println("file length "+file.length());
			System.out.println("file list "+file.list());
		}
		else {
			System.out.println("FIle doesnot exists");
		}
		
//		-----Code to Delete the file ----
		boolean b=file.delete();
		if(b==true) {
			System.out.println("File deleted");
		}else {
			System.out.println("File not deleted");
		}
//		----End of above code===
	}
} catch(IOException e){
	e.printStackTrace();
}
	}

}
