package abstraction.multipleInheritance;

public class CalImplmetation implements CalculatotInter{

	@Override
	public void multyplay(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subs(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divide(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		CalculatotInter i1=new CalImplmetation();
		i1.add(2, 3);
		i1.divide(3, 4);
		i1.subs(3, 2);
		i1.multyplay(4, 9);
	}
	
}
