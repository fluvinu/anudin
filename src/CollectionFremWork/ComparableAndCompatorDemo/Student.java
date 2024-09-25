package CollectionFremWork.ComparableAndCompatorDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{
    int rollno;
	String name;
	int age;

    Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
    }


    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        if(age==o.age)
		return 0;
		
        // if you want in dec oeder then use < sigh

		else if(age>o.age)
			return 1;
		else
			return -1;
    }

     public static void main(String[] args) {
        ArrayList<Student> a1=new ArrayList<Student>();

        a1.add(new Student(101, "sidharth2" , 34));
        a1.add(new Student(101, "sidharth", 22));
        a1.add(new Student(101, "sidharth2" , 19));
        a1.add(new Student(101, "sidharth2" , 49));


        // short
        Collections.sort(a1);

        // foreach
        for (Student student : a1) {
            System.out.println(student.rollno+" "+student.name+" "+student.age);
        }

    }
    
}
