package design.pattern.template;

import java.util.List;

public class ProcessStoreOrder extends AbstractProcessOrder{

	@Override
	protected double determineUnitPrice(String itemCode) {
		System.out.println("Store scans item code to determine the price");
		return 100; //Fictional price
	}

	@Override
	protected double determineTax(String itemCode) {
		System.out.println("Store gets the tax amount when item has been scanned");
		return 0; //Fictional tax
	}

	@Override
	protected double determineDiscount(String itemCode) {
		System.out.println("Store gets the discount amount when item has been scanned");
		return 0; //Fictional discount
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
