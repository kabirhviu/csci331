package design.pattern.decorator;

public class Espresso extends Beverage{

	public Espresso() {
		setDescription("Very Fine Esspresso");
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 2.10;
	}

}
