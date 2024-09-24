package Inheritance.sigleLeven;

public class Btech extends MCA{
	
	int student;
	String CAt;
	
	Btech(){
		System.out.println("btech object created");
	}
	
	void btechInfo(int stu, String cat) {
		System.out.println("========betch info method=========");
		System.out.println("student are "+stu);
		System.out.println("categrt are "+cat);
	}
	
	@Override
	void forOverrinding() {
		super.forOverrinding();
		System.out.println("hitherei am overrididnd");
	}
}
