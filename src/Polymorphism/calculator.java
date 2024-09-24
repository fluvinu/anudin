package Polymorphism;

public class calculator {
	
	public static void main(String[] args) {

		calculator c1=new calculator();
		System.out.println(c1.cal(1, 3));
		System.out.println(c1.cal(1, 3));
		System.out.println(c1.cal(2, 4));
		System.out.println(c1.cal(4, 5));
		System.out.println(c1.cal(3, 7));
		
	}
	
	double cal(int a,double b) {
		return a+b;
	}
	
	double cal(double c,int d) {
		return c-d;
	}
	
	double cal(int e,int f) {
		return e*f;
	}
	double cal(double g, double h) {
		return g/h;
	}
}
