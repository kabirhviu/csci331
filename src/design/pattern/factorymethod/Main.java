package design.pattern.factorymethod;

import java.util.Calendar;
import java.util.Date;

import design.pattern.factorymethod.CreditCardFactory.CardType;

public class Main {
	
	public static void main(String[] args) {
		
		String cardNumber ="555-555-555-555";
		String cardHolderName = "The Card Holder";
		Date expiryDate = Calendar.getInstance().getTime();
		double cardLimit = 5000.0;
		
		ICreditCard creditCard = CreditCardFactory.createCreditCard(CardType.VISA, cardNumber, cardHolderName, expiryDate, cardLimit);
		System.out.println("Credit Limit of "+ creditCard.cardProvider() + ":" +
							creditCard.getCardNumber() + " is "+
							CreditCheck.creditLimit(creditCard));
		cardNumber ="444-444-444-444";
		cardLimit = 4000.0;
		creditCard = CreditCardFactory.createCreditCard(CardType.MASTER, cardNumber, cardHolderName, expiryDate, cardLimit);
		System.out.println("Credit Limit of "+ creditCard.cardProvider() + ":" +
							creditCard.getCardNumber() + " is "+
							CreditCheck.creditLimit(creditCard));
		
	}

}
