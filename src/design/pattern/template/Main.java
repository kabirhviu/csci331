package design.pattern.template;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static final void main(String[] args) {
		List<Item> cartItems = new ArrayList<Item>();
		cartItems.add(new Item("P001", 100.0));
		cartItems.add(new Item("P002", 200.0));
		
		AbstractProcessOrder processOrder = new ProcessStoreOrder();
		processOrder.process(cartItems);
		
		processOrder = new ProcessOnlineOrder();
		processOrder.process(cartItems);
		
	}
	

}
