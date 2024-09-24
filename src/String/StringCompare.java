package String;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = "Hello"; // interned string

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4);   //true

        System.out.println(str1.equals(str3)); //  true

    }
}
