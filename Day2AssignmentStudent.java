package OopsJava;

public class Day2AssignmentStudent {
	String name;
	int age;
	char Sec;
	char gen;
	int sub1,sub2,sub3;
	float totmarks,percntg;
	

	Day2AssignmentStudent(String name,int age,char Sec,char gen,int sub1,int sub2,int sub3){
		this.name=name;
		this.age=age;
		this.Sec=Sec;
		this.gen=gen;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		TotMarks(sub1,sub2,sub3);
		}
	
	
	Day2AssignmentStudent(String name,int age,char Sec,char gen,int sub2,int sub3){
		this.name=name;
		this.age=age;
		this.Sec=Sec;
		this.gen=gen;
		this.sub2=sub2;
		this.sub3=sub3;
		TotMarks(sub2,sub3);
		}
	
	public void TotMarks(int sub1,int sub2,int sub3) {
		totmarks=sub1+sub2+sub3;
		System.out.println("Total marks is "+totmarks);
		percent(totmarks);
	}
	
	public void TotMarks(int sub2,int sub3) {
		totmarks=sub2+sub3;
		System.out.println("Total marks is "+totmarks);
		percent(totmarks);
	}
	void percent(float t){
		float percntg=(t*100)/300;
		System.out.println("Percentage is "+percntg);
		System.out.println("------------------------");
	}

	public static void main(String[] args) {
		Day2AssignmentStudent s1=new Day2AssignmentStudent("Sush",22,'B','F',80,90,85);
		Day2AssignmentStudent s2=new Day2AssignmentStudent("Appi",23,'A','F',85,60);
		Day2AssignmentStudent s3=new Day2AssignmentStudent("Quin",25,'B','F',75,80);
		Day2AssignmentStudent s4=new Day2AssignmentStudent("Nick",20,'C','M',90,85,90);

	}

}
