package AggregationEg;

class Operation{
  int Square(int a) {
	  return a*a;
  }
}



public class Agg {
Operation O;

double Area(int r) {
	O=new Operation();
	int rsq=O.Square(r);
	return (3.14*rsq);
}
	public static void main(String[] args) {
		Agg C=new Agg();
		
double res=C.Area(5);
System.out.println(res);
	}

}
