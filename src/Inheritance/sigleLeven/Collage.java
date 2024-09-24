package Inheritance.sigleLeven;

public class Collage {
	
	String cName ;
	String uName;
	
	Collage(){
		System.out.println("collage object created ");
	}
	
	void collageInfo(String name , String uname) {
		System.out.println("=======colage info mrtthod=======");
		System.out.println(name+" "+uname);
	}
	
	void forOverrinding() {
		System.out.println("i am not overridded");
	}
}
