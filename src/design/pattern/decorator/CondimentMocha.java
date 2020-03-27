package design.pattern.decorator;

public class CondimentMocha extends CondimentDecorator {

	public CondimentMocha(Beverage beverage) {
		setBeverage(beverage);
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return getBeverage().cost() + 0.20;
	}
	
	public String getDescription() {
		return getBeverage().getDescription() + " Mocha";
	}

}
