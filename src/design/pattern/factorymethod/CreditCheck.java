package design.pattern.factorymethod;

public class CreditCheck {
	public static double creditLimit(ICreditCard creditCard) {
		return creditCard.cardLimit() - creditCard.cardBalance();
	}
}
