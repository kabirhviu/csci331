package design.pattern.template;

import java.util.List;

public abstract class AbstractProcessOrder {

	protected abstract double determineUnitPrice(Item item);
	protected abstract double determineTax(Item item);
	protected abstract double determineDiscount(Item item);
	protected abstract boolean receivePayment(double amount);
	protected abstract void deliver(List<Item> cartItems);
	
	/*
	 * Template method, should be final to stop overriding by the sub class
	 */
	public final void process(List<Item> cartItems) {
		double total =0.0;
		for(Item item:cartItems) {
			total += determineUnitPrice(item);
			total += determineDiscount(item);
			total += determineTax(item);
		}
		
		System.out.println("Please, pay order total: " + total);
		
		if(receivePayment(total)) {
			deliver(cartItems);
		}
		else {
			System.out.println("Did not make delivery due to non-payment.");
		}
	}
}
