package design.pattern.factorymethod;

import java.util.Date;

public class VisaCreditCard implements ICreditCard {

	private static final String CARD_PROVIDER_VISA = "Visa";

	String cardNumber;
	String cardHolderName;
	Date expiryDate;
	private double cardLimit;
	private double cardBalance;

	public VisaCreditCard(String cardNumber, String cardHolderName,
			Date expiryDate, double cardLimit) {
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.expiryDate = expiryDate;
		this.setCardLimit(cardLimit);
		this.setCardBalance(0.0);
	}

	@Override
	public String getCardNumber() {
		return cardNumber;
	}

	@Override
	public String getCardHolderName() {
		return cardHolderName;
	}

	@Override
	public Date getExpiryDate() {
		return expiryDate;
	}

	@Override
	public double cardLimit() {
		return cardLimit;
	}

	@Override
	public double cardBalance() {
		return cardBalance;
	}

	/**
	 * @param cardLimit
	 *            the cardLimit to set
	 */
	public void setCardLimit(double cardLimit) {
		this.cardLimit = cardLimit;
	}

	/**
	 * @param cardBalance
	 *            the cardBalance to set
	 */
	public void setCardBalance(double cardBalance) {
		this.cardBalance = cardBalance;
	}

	/*
	 * Methods specific to Visa Credit Card should be added
	 */

	public String cardProvider() {
		return CARD_PROVIDER_VISA;
	}

}
