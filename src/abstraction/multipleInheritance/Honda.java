package abstraction.multipleInheritance;

public class Honda implements Bike,Car{

	@Override
	public void carWeesl() {
		// TODO Auto-generated method stub
		System.out.println("4 weel");
	}

	@Override
	public void carColor() {
		// TODO Auto-generated method stub
		System.out.println("red");
	}

	@Override
	public void bikecolr() {
		// TODO Auto-generated method stub
		System.out.println("green");
	}

	@Override
	public void bikeWeel() {
		// TODO Auto-generated method stub
		System.out.println("2weel");
	}
	
	public static void main(String[] args) {
		Honda h1=new Honda();
		h1.bikecolr();
		h1.bikeWeel();
		h1.carColor();
		h1.carWeesl();
		
	}
	
}
