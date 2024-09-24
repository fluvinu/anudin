package Inheritance.multilevel;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		Person(name,id,city)
//		Employee(name,city,sal)(inherit person)
//		Student(name,roll_no,dept)(inherit employee class)
//		Take input from user scanner
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter roll no");
		int rollNo=sc1.nextInt();
		System.out.println("rnter dept");
		String dept=sc1.next();
		System.out.println("enter city ");
		String city=sc1.next();
		System.out.println("enter sal ");
		double sal=sc1.nextDouble();
		System.out.println("enter name ");
		String name = sc1.next();
		System.out.println("enter id ");
		String id = sc1.next();
		
		new Student(rollNo, dept, city, sal, name, id);
		

		
		
	}
}
