package Polymorphism;

public class Employee {
	//Print(name,id)
//	Print(id,sal)
//	Print(name,desg)
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.print(11, 220);
		e1.print("aarav", 2);
		e1.print("arav", "devlopwer");
	}
	
	public void print(String name, int id) {
		System.out.println("name is "+name+" "+id);
	}
	
	public void print(int id, double sal) {
		System.out.println("name is "+id+" "+sal);
	}
	
	public void print(String name, String desg) {
		System.out.println("name is "+name+" "+desg);
	}
	
	
	
}
