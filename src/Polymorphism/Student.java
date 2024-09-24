package Polymorphism;

public class Student {

	public void print_info(String name) {
		System.out.println("Name of student:"+name);
	}
	
	public void print_info(int age) {
		System.out.println("Age of student:"+age);
	}
	
	public void print_info(String name,int age) {
		System.out.println("Basic info of student:"+name+age);
	}
	
	public static void main(String[] args) {
		//object create
		Student s1=new Student();
		//call 
		s1.print_info("abc");
		s1.print_info(20);
		s1.print_info("xyz",10);
	}
}