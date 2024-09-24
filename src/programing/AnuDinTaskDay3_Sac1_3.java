package programing;

public class AnuDinTaskDay3_Sac1_3 {
    public static void main(String[] args) {
        Employee e1=new Employee(1, "sid", 56000.0);
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e1.salary);
    }
}

// suprclsss 
class User{
    int id ;
    String name ;
    User(int id,String name){
        this.id=id;
        this.name=name;
    }
}

// subclss 

class Employee extends User{
    double salary ;
    Employee(int id, String name,double sal) {
        super(id, name);
        salary=calAnuSal(sal);
        //TODO Auto-generated constructor stub
    }
    public double calAnuSal(double sal) {
        return  sal*12 ;
    }
}