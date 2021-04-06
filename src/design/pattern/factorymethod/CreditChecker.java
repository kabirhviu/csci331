package design.pattern.factorymethod;

public class CreditChecker {
	public static double creditLimit(ICreditCard creditCard) {
		return creditCard.cardLimit() - creditCard.cardBalance();
	}
}
