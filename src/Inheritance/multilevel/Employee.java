package Inheritance.multilevel;

public class Employee extends Person {
	
	
	String city;
	double sal;
	
	public Employee(String city,double sal,String name,String id) {
		super(name,id);
		this.city=city;
		this.sal=sal;
		
		infoEmplo();
	}
	
	void infoEmplo() {
		System.out.println("cityis "+city+" sal is"+sal);
	}

}
