package design.pattern.factorymethod;

import java.util.Date;

public class CreditCardFactory {
	
	public enum CardType {
		VISA,
		MASTER
	}
	
	public static ICreditCard createCreditCard(CardType type, String cardNumber, String cardHolderName) {
		if(type==CardType.MASTER) {
			return new MasterCreditCard(cardNumber, cardHolderName);
		}
		else if(type ==CardType.VISA) {
			return new VisaCreditCard(cardNumber, cardHolderName);
		}
		else {
			throw new IllegalArgumentException("Wrong card type!");
		}
	}

}
