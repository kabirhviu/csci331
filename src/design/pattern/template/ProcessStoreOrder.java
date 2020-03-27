package design.pattern.template;

import java.util.List;

public class ProcessStoreOrder extends AbstractProcessOrder{
	
	private static final double TAX = 0.12;
	private static final double DISCOUNT = 0.05;

	@Override
	protected double determineUnitPrice(Item item) {
		System.out.println("Store scans item code to determine the price");
		return item.getPrice(); //Fictional price
	}

	@Override
	protected double determineTax(Item item) {
		System.out.println("Store gets the tax amount when item has been scanned");
		return item.getPrice()*TAX; //Fictional tax
	}

	@Override
	protected double determineDiscount(Item item) {
		System.out.println("Store gets the discount amount when item has been scanned");
		return item.getPrice()*DISCOUNT; //Fictional discount
	}

	@Override
	protected boolean receivePayment(double amount) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected void deliver(List<Item> cartItems) {
		// TODO Auto-generated method stub
		System.out.println("Items delivered at the store.");
		
	}

}
