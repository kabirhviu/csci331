package design.pattern.decorator;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		setDescription("Most Excellent Dark Roast");
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

}
