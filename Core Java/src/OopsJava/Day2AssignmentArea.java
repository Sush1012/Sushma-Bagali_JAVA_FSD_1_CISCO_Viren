package OopsJava;

public class Day2AssignmentArea {
	int l ;
	int len;
	int br;
	float r;

	Day2AssignmentArea(){
		
	}
	
    Day2AssignmentArea(int ls){
		l=ls;
		}
	
    Day2AssignmentArea(int ln,int bd){
	len=ln;
	br=bd;
    }

    Day2AssignmentArea(float rc){
	r=rc;
    }

	void Disp1() {
		System.out.println((0.5*l*l));
	}
	
	void Disp2() {
		System.out.println((len*br));
	}

	void Disp3() {
		System.out.println((3.14*r*r));
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Day2AssignmentArea A1=new Day2AssignmentArea(2);
		Day2AssignmentArea A2=new Day2AssignmentArea(4,4);
		Day2AssignmentArea A3=new Day2AssignmentArea(2.5f);
		A1.Disp1();
		A2.Disp2();
		A3.Disp3();

	}

}
