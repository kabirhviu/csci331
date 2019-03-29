package design.pattern.template;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static final void main(String[] args) {
		List<Item> cartItems = new ArrayList<Item>();
		cartItems.add(new Item());
		
		AbstractProcessOrder processOrder = new ProcessStoreOrder();
		processOrder.process(cartItems);
		
		processOrder = new ProcessOnlineOrder();
		processOrder.process(cartItems);
		
	}
	

}
