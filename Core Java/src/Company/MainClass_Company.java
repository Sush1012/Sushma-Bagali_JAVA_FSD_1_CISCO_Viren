package Company;

public class MainClass_Company extends Hello_Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//new Hello_Company().show();
//new Hello_Company().disp();
//System.out.println(new  Hello_Company().add());
//
//System.out.println(new Hello_Company().sub());
		Infosys_Company i;
		i=new Hello_Company(); //Dynamic polymorfism
		i.show();
		i.disp();
		System.out.println(i.add());
		Hello_Company j=new Hello_Company();
		System.out.println(j.sub());
	}

}
