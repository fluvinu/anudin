package programing;

import java.util.Scanner;

public class AnuDinTaskDay2_3 {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("eenter a number");
		int a=sc1.nextInt();
		System.out.println("Enter a th digit");
		int b=sc1.nextInt();
		
		if(((1<<b)&a)!=0) {
			System.out.println("it is set of "+1);
			
		}else {
			System.out.println("it is set of "+0);
		}
	}

}
