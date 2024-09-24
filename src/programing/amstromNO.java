package programing;

public class amstromNO {
	
	public static void main(String[] args) {
		int a = 1;
		int b= 2000000000;
		isAmstrom(a, b);
		System.out.println("hekjbsdj");
	}
	
	static void isAmstrom(int a,int b) {
		for(int i=a;i<b;i++) {
			
			int digit=0;
			int temp=i;
			// digit
			while(temp>0) {
				temp=temp/10;
				digit++;
			}
			
			int cNum2=i;
			int sum=0;
			// sum
			while(cNum2>0) {
				int lastDigit=cNum2%10;
				sum=(int) (sum+Math.pow(lastDigit, digit));
				cNum2=cNum2/10;
			}
			
			if(i==sum) {
				System.out.println(i+" is amstrom");
			}
			
		}
		
	}

}
