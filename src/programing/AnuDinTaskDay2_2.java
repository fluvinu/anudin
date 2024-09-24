package programing;

import java.util.Scanner;

public class AnuDinTaskDay2_2 {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("eenter a number");
		int a=sc1.nextInt();
		System.out.println("Enter a Number");
		int b=sc1.nextInt();
		
		// trnary oprtot
		String rsut=(a>b)?"Big No is- "+a:" Big No is "+b;
		System.out.println(rsut);
		
		
	}
}
