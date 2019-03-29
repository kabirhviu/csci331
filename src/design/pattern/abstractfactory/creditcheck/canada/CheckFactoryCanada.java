package design.pattern.abstractfactory.creditcheck.canada;

import design.pattern.abstractfactory.check.IBillingCheck;
import design.pattern.abstractfactory.check.ICheckFactory;
import design.pattern.abstractfactory.check.ICreditCheck;
import design.pattern.abstractfactory.check.IShippingCheck;
import design.pattern.factorymethod.ICreditCard;

public class CheckFactoryCanada implements ICheckFactory {
	
	public static class CreditCheckCanada implements ICreditCheck {

		@Override
		public double creditLimit(ICreditCard creditCard) {
			return creditCard.cardLimit() - creditCard.cardBalance();
		}
	}
	
	public static class BillingCheckCanada implements IBillingCheck {

		@Override
		public boolean isResidential() {
			return false;
		}
	}
	
	public static class ShippingCheckCanada implements IShippingCheck {

		@Override
		public boolean hasTarrif() {
			return true;
		}
		
	}

	@Override
	public ICreditCheck createCreditCheck() {
		return new CreditCheckCanada();
	}

	@Override
	public IBillingCheck createBillingCheck() {
		return new BillingCheckCanada();
	}

	@Override
	public IShippingCheck createShippingCheck() {
		return new ShippingCheckCanada();
	}

}
