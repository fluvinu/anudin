package Inheritance.hirarical;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc1= new Scanner(System.in);
		
		
		System.out.println("which company rule u waht to see");
		System.err.println("enter your choise ");
		System.out.println("1) internationa comapny ");
		System.out.println("2) indian coampany");
		System.out.println("0) exit");
		
		
		int chosse=sc1.nextInt();
		switch(chosse) {
		case 1:
			new InternatinalCompany();
			break;
		case 2:
			new IndianCompany();
			break;
		default:
			System.out.println("somthig wrong ");
			System.out.println("trerminating progaram");
			sc1.close();
			System.exit(0);
		}
	}
}
