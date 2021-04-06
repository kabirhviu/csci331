package design.pattern.abstractfactory;

import java.util.Calendar;
import java.util.Date;

import design.pattern.abstractfactory.checker.IBillingChecker;
import design.pattern.abstractfactory.checker.ICheckerFactory;
import design.pattern.abstractfactory.checker.ICreditChecker;
import design.pattern.abstractfactory.checker.IShippingChecker;
import design.pattern.abstractfactory.countrychecker.canada.CheckerFactoryCanada;
import design.pattern.abstractfactory.countrychecker.us.CheckerFactoryUS;
import design.pattern.factorymethod.ICreditCard;
import design.pattern.factorymethod.CreditCardFactory;
import design.pattern.factorymethod.CreditCardFactory.CardType;

public class CheckersClient {

	public static void main(String[] args) {
		
		String cardNumber ="555-555-555-555";
		String cardHolderName = "The Card Holder";
		Date expiryDate = Calendar.getInstance().getTime();
		double cardLimit = 5000.0;
		
		ICreditCard creditCard = CreditCardFactory.createCreditCard(CardType.VISA, cardNumber, cardHolderName, expiryDate, cardLimit);
		
		
		ICheckerFactory checkerFactory;
		ICreditChecker creditChecker;
		IBillingChecker billingChecker;
		IShippingChecker shippingChecker;
		
		//Instantiate all check classes whose implementations are Canada specific 
		checkerFactory = new CheckerFactoryCanada();
		creditChecker = checkerFactory.createCreditChecker();
		billingChecker = checkerFactory.createBillingChecker();
		shippingChecker = checkerFactory.createShippingChecker();
		
		System.out.println("Using Canadian check classes... \nCredit Limit of "+ creditCard.cardProvider() + ":" +
				creditCard.getCardNumber() + " is "+
				creditChecker.creditLimit(creditCard) +
				", isResidential: "+ billingChecker.isResidential() +
				", hasTarrif: "+ shippingChecker.hasTarrif());
		
		
		//Instantiate all check classes whose implementations are US specific 
		checkerFactory = new CheckerFactoryUS();
		creditChecker = checkerFactory.createCreditChecker();
		billingChecker = checkerFactory.createBillingChecker();
		shippingChecker = checkerFactory.createShippingChecker();
		
		System.out.println("Using US check classes... \nCredit Limit of "+ creditCard.cardProvider() + ":" +
				creditCard.getCardNumber() + " is "+
				creditChecker.creditLimit(creditCard) +
				", isResidential: "+ billingChecker.isResidential() +
				", hasTarrif: "+ shippingChecker.hasTarrif());

	}

}
