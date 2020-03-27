package design.pattern.decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage darkroast = new DarkRoast();
		System.out.println(darkroast.getDescription() + " cost: " + darkroast.cost());
		
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() + " cost: " + espresso.cost());
		
		Beverage mochaDarkRoast = new CondimentMocha(new DarkRoast());
		System.out.println(mochaDarkRoast.getDescription() + " cost: " + mochaDarkRoast.cost());
		
		Beverage milkDarkRoast = new CondimentMilk(new DarkRoast());
		System.out.println(milkDarkRoast.getDescription() + " cost: " + milkDarkRoast.cost());
		
		Beverage mochaEspresso = new CondimentMocha(new Espresso());
		System.out.println(mochaEspresso.getDescription() + " cost: " + mochaEspresso.cost());
		
		Beverage milkEspresso = new CondimentMilk(new Espresso());
		System.out.println(milkEspresso.getDescription() + " cost: " + milkEspresso.cost());
		
		Beverage mochaMilkDarkRoast = new CondimentMocha(new CondimentMilk(new DarkRoast()));
		System.out.println(mochaMilkDarkRoast.getDescription() + " cost: "+ mochaMilkDarkRoast.cost());
		
		Beverage mochaMilkEspresso = new CondimentMocha(new CondimentMilk(new Espresso()));
		System.out.println(mochaMilkEspresso.getDescription() + " cost: " + mochaMilkEspresso.cost());

	}

}
