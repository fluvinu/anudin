package Inheritance.multilevel;

public class Student extends Employee {
	int rollNo;
	String dept;
	
	Student(int rollNo,String dept,String city,double sal,String name,String id){
		super(city,sal,name,id);
		this.rollNo=rollNo;
		this.dept=dept;
		
		stuInfo();
		// 
	}
	
	void stuInfo() {
		System.out.println("roll no is "+rollNo+"dept is "+dept);
	}

}
