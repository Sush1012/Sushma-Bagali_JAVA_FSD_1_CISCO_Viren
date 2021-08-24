package Day6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.stream.FileImageOutputStream;

class Student implements java.io.Serializable{
	
	private int stuRollnum;
	private int stuAge;
	private String stuName;
	private String stuAddress;
	private int stuHeight;
	
	public Student(int roll,int age,String name,String addr,int height) {
		this.stuRollnum=roll;
		this.stuAge=age;
		this.stuName=name;
		this.stuAddress=addr;
		this.stuHeight=height;
	}
	
	public int getStuRollNum() {
		return stuRollnum;
	}
	public void setStuRollNum() {
		this.stuRollnum=stuRollnum;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge() {
		this.stuAge=stuAge;
	}
	public String getStuName() {
		return stuName;
	}
	public String setStuName() {
		return stuName;
	}
	public String getAddr() {
		return stuAddress;
	}
	public String setAddr() {
		return stuAddress;
	}
	public int getStuHeight() {
		return stuHeight;
	}
	public void setStuHeight() {
		this.stuHeight=stuHeight;
	}
}

public class Serial_DeserialDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Student obj=new Student(101, 20, "Nikhil","Hubli",5);
FileOutputStream fos=null;
ObjectOutputStream oos=null;

try {
	fos=new FileOutputStream("C:\\\\Users\\\\Hp\\\\Desktop\\\\interns\\\\Student");
	oos=new ObjectOutputStream(fos);
	oos.writeObject(obj);
	System.out.println("Serialzation done");
}catch (IOException ioe) {
	// TODO: handle exception
	System.out.println(ioe);
}
finally {
	oos.close();
	fos.close();
}
//Deserialization
Student o=null;
try {
	FileInputStream fis=new FileInputStream("C:\\\\\\\\Users\\\\\\\\Hp\\\\\\\\Desktop\\\\\\\\interns\\\\\\\\Student");
    ObjectInputStream ois=new ObjectInputStream(fis);
	o=(Student) ois.readObject();
	ois.close();
	fis.close();
}catch (IOException e) {
	// TODO: handle exception
	e.printStackTrace();
	return;
}catch (ClassNotFoundException e1) {
	// TODO: handle exception
	System.out.println("Student class not found.");
	e1.printStackTrace();
	return;
}
System.out.println("Student name: "+o.getStuName());
System.out.println("Student Age: "+o.getStuAge());
System.out.println("Student RollNumber: "+o.getStuRollNum());
System.out.println("Student Address: "+o.getAddr());
System.out.println("Student Height: "+o.getStuHeight());

	}

}
