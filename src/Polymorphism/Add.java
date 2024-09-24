package Polymorphism;


public class Add {
	
	//public int add
	static int add(int a,int b) {
		return a+b;
	}
	//public double add
	static double add(double a,double b) {
		return a+b;
	}

	public static void main(String[] args) {
		//Add a1=new Add();
		System.out.println(Add.add(10, 10));
		System.out.println(Add.add(10.5,10.5));
	}
}
