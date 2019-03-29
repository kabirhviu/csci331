package design.pattern.template;

import java.util.List;

public class ProcessOnlineOrder extends AbstractProcessOrder{

	@Override
	protected double determineUnitPrice(String itemCode) {
		System.out.println("Online site determines the price from the item code");
		return 100; //Fictional price
	}

	@Override
	protected double determineTax(String itemCode) {
		System.out.println("Online site gets the tax amount from the item code.");
		return 0; //Fictional tax
	}

	@Override
	protected double determineDiscount(String itemCode) {
		System.out.println("Online site gets the discount amount from the item code.");
		return 0; //Fictional discount
	}

	@Override
	protected boolean receivePayment(double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void deliver(List<Item> cartItems) {
		// TODO Auto-generated method stub
		System.out.println("Items have been shipped to the customer.");
		
	}

}
