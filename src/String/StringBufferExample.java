package String;

public class StringBufferExample {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello, ");
        sb.append("World!");
        sb.append("Earth");
        System.out.println(sb);

        // insert
        sb.insert(7, "Java");
        System.out.println(sb);

        // delete
        sb.delete(7, 11);
        System.out.println(sb);

        // capasity
        System.out.println(sb.capacity());

        // size
        System.out.println(sb.length());

        // tostring
        System.out.println(sb.toString());

        // string buffer into string by to string method

        String msg = sb.toString();
        System.out.println(msg);

    }
}
