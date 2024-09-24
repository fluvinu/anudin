package Inheritance.multilevel;

public class Person {
	String name;
	String id;
	
	public Person(String name,String id) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		
		perInfo();
	}
	
	void perInfo() {
		System.out.println("name is "+name+" id is"+id);
	}
}
