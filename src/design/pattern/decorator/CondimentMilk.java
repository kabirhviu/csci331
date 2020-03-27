package design.pattern.decorator;

public class CondimentMilk extends CondimentDecorator {

	public CondimentMilk(Beverage beverage) {
		setBeverage(beverage);
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return getBeverage().cost() + 0.10;
	}
	
	public String getDescription() {
		return getBeverage().getDescription() + " Milk";
	}

}
