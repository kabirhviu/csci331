package design.pattern.factorymethod;

import java.util.Calendar;
import java.util.Date;

public class MasterCreditCard implements ICreditCard {

	private static final String CARD_PROVIDER_MASTER = "Master";
	private static final Date today = Calendar.getInstance().getTime();

	String cardNumber;
	String cardHolderName;
	Date expiryDate;
	private double cardLimit;
	private double cardBalance;

	public MasterCreditCard(String cardNumber, String cardHolderName) {
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.expiryDate = today;
		this.setCardLimit(2000.0);
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
		// TODO Auto-generated method stub
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
	 * Methods specific to Master Credit Card should be added
	 */

	public String cardProvider() {
		return CARD_PROVIDER_MASTER;
	}

}
