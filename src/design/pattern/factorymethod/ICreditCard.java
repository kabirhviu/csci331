package design.pattern.factorymethod;

import java.util.Date;

public interface ICreditCard {
	String getCardNumber();
	String getCardHolderName();
	Date getExpiryDate();
	double cardLimit();
	double cardBalance();
	String cardProvider();
}
