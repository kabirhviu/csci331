package design.pattern.template;

import java.util.List;

public class OnlineOrderProcessor extends AbstractOrderProcessor{
	
	private static final double TAX = 0.20;
	private static final double DISCOUNT = 0.0;

	@Override
	protected double determineUnitPrice(Item item) {
		System.out.println("Online site determines the price from the item");
		return item.getPrice(); //Fictional price
	}

	@Override
	protected double determineTax(Item item) {
		System.out.println("Online site gets the tax amount from the item.");
		return item.getPrice()*TAX; //Fictional tax
	}

	@Override
	protected double determineDiscount(Item item) {
		System.out.println("Online site gets the discount amount from the item.");
		return item.getPrice()*DISCOUNT; //Fictional discount
	}

	@Override
	protected boolean receivePayment(double amount) {
		// TODO Need to work with payment gateway
		return false;
	}

	@Override
	protected void deliver(List<Item> cartItems) {
		// TODO Auto-generated method stub
		System.out.println("Items have been shipped to the customer.");
		
	}

}
