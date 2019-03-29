package design.pattern.abstractfactory.creditcheck.us;

import design.pattern.abstractfactory.check.IBillingCheck;
import design.pattern.abstractfactory.check.ICheckFactory;
import design.pattern.abstractfactory.check.ICreditCheck;
import design.pattern.abstractfactory.check.IShippingCheck;
import design.pattern.factorymethod.ICreditCard;

public class CheckFactoryUS implements ICheckFactory {
	
	public static class CreditCheckUS implements ICreditCheck {

		@Override
		public double creditLimit(ICreditCard creditCard) {
			return creditCard.cardLimit() - creditCard.cardBalance();
		}
	}
	
	public static class BillingCheckUS implements IBillingCheck {

		@Override
		public boolean isResidential() {
			return true; //Treats US as residential
		}
	}
	
	public static class ShippingCheckUS implements IShippingCheck {

		@Override
		public boolean hasTarrif() {
			return false; //US customer does not pay tarrif
		}
		
	}

	@Override
	public ICreditCheck createCreditCheck() {
		return new CreditCheckUS();
	}

	@Override
	public IBillingCheck createBillingCheck() {
		return new BillingCheckUS();
	}

	@Override
	public IShippingCheck createShippingCheck() {
		return new ShippingCheckUS();
	}

}
