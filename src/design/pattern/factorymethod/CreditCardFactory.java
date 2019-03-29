package design.pattern.factorymethod;

import java.util.Date;

public class CreditCardFactory {
	
	public enum CardType {
		VISA,
		MASTER
	}
	
	public static ICreditCard createCreditCard(CardType type, String cardNumber, String cardHolderName, 
			Date expriyDate, double cardLimit) {
		if(type==CardType.MASTER) {
			return new MasterCreditCard(cardNumber, cardHolderName, expriyDate, cardLimit);
		}
		else if(type ==CardType.VISA) {
			return new VisaCreditCard(cardNumber, cardHolderName, expriyDate, cardLimit);
		}
		else {
			throw new IllegalArgumentException("Wrong card type!");
		}
	}

}
