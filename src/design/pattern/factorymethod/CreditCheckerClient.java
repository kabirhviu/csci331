package design.pattern.factorymethod;

import java.util.Calendar;
import java.util.Date;

import design.pattern.factorymethod.CreditCardFactory.CardType;

public class CreditCheckerClient {
	
	public static void main(String[] args) {
		
		String cardNumber ="555-555-555-555";
		String cardHolderName = "Card Holder 1";
		
		ICreditCard creditCard = CreditCardFactory.createCreditCard(CardType.VISA, cardNumber, cardHolderName);
		System.out.println("Credit Limit of "+ creditCard.cardProvider() + ":" +
							creditCard.getCardNumber() + " is "+
							CreditChecker.creditLimit(creditCard));
		
		cardNumber ="444-444-444-444";
		cardHolderName = "Card Holder 2";
		creditCard = CreditCardFactory.createCreditCard(CardType.MASTER, cardNumber, cardHolderName);
		System.out.println("Credit Limit of "+ creditCard.cardProvider() + ":" +
							creditCard.getCardNumber() + " is "+
							CreditChecker.creditLimit(creditCard));
		
	}

}
