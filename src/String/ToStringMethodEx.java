package String;

public class ToStringMethodEx {
    int rollNo;
    String name;

    //constructor
    public ToStringMethodEx(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    //toString method
    public static void main(String[] args) {
        ToStringMethodEx obj = new ToStringMethodEx(1, "Rahul");
        ToStringMethodEx  obj1 = new ToStringMethodEx(2, "Rahul");
        System.out.println(obj);
        System.out.println(obj1);
    }

    //overider to string
    @Override
    public String toString() {
        return "ToStringMethodEx [rollNo=" + rollNo + ", name=" + name +
        "]";
        }
    
}
