package design.pattern.abstractfactory.countrychecker.us;

import design.pattern.abstractfactory.checker.IBillingChecker;
import design.pattern.abstractfactory.checker.ICheckerFactory;
import design.pattern.abstractfactory.checker.ICreditChecker;
import design.pattern.abstractfactory.checker.IShippingChecker;
import design.pattern.factorymethod.ICreditCard;

public class CheckerFactoryUS implements ICheckerFactory {
	
	public static class CreditCheckerUS implements ICreditChecker {

		@Override
		public double creditLimit(ICreditCard creditCard) {
			return creditCard.cardLimit() - creditCard.cardBalance();
		}
	}
	
	public static class BillingCheckerUS implements IBillingChecker {

		@Override
		public boolean isResidential() {
			return true; //Treats US as residential
		}
	}
	
	public static class ShippingCheckerUS implements IShippingChecker{

		@Override
		public boolean hasTarrif() {
			return false; //US customer does not pay tarrif
		}
		
	}

	@Override
	public ICreditChecker createCreditChecker() {
		return new CreditCheckerUS();
	}

	@Override
	public IBillingChecker createBillingChecker() {
		return new BillingCheckerUS();
	}

	@Override
	public IShippingChecker createShippingChecker() {
		return new ShippingCheckerUS();
	}

}
