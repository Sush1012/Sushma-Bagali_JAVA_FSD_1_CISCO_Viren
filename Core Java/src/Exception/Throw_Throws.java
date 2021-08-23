package Exception;
import java.io.IOException;

public class Throw_Throws {
void m() throws IOException{
	throw new IOException("device error");
}

void n() throws IOException{
	m();
}

void p() {
	try {
		n();
	}
	catch(Exception e) {
		System.out.println("exception handeled");
		System.out.println(e.getMessage());
		System.out.println(e.getStackTrace());
		System.out.println(e.getClass());
	}
}
	public static void main(String[] args) {
Throw_Throws obj=new Throw_Throws();
obj.p();
System.out.println("normal flow....");
	}

}
