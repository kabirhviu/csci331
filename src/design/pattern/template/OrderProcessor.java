package design.pattern.template;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {
	
	public static final void main(String[] args) {
		List<Item> cartItems = new ArrayList<Item>();
		cartItems.add(new Item("P001", 100.0));
		cartItems.add(new Item("P002", 200.0));
		
		AbstractOrderProcessor processOrder = new StoreOrderProcessor();
		processOrder.process(cartItems);
		
		processOrder = new OnlineOrderProcessor();
		processOrder.process(cartItems);
		
	}
	

}
