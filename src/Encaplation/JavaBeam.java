package Encaplation;


public class JavaBeam {
	private String name;
	private String pass;
	
	protected String email="email.com";
	
	protected void email() {
		System.out.println(email);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
	
}
