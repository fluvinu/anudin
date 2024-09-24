package programing;

public class ReverseString {
	public static void main(String[] args) {
		String str="abcd";
		String sr="";
		for(int i=0;i<str.length();i++) {
			char currentCh=str.charAt(i);
			sr=currentCh+sr;
		}
		System.out.println(sr);
	}
}
