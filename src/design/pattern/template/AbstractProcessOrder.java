package design.pattern.template;

import java.util.List;

public abstract class AbstractProcessOrder {

	protected abstract double determineUnitPrice(String itemCode);
	protected abstract double determineTax(String itemCode);
	protected abstract double determineDiscount(String itemCode);
	protected abstract boolean receivePayment(double amount);
	protected abstract void deliver(List<Item> cartItems);
	
	/*
	 * Template method, should be final to stop overriding by the sub class
	 */
	public final void process(List<Item> cartItems) {
		double total =0.0;
		for(Item item:cartItems) {
			total += determineUnitPrice(item.getCode());
			total += determineDiscount(item.getCode());
			total += determineTax(item.getCode());
		}
		if(receivePayment(total)) {
			deliver(cartItems);
		}
		else {
			System.out.println("Did not make delivery due to non-payment.");
		}
	}
}
