package design.pattern.abstractfactory.countrychecker.canada;

import design.pattern.abstractfactory.checker.IBillingChecker;
import design.pattern.abstractfactory.checker.ICheckerFactory;
import design.pattern.abstractfactory.checker.ICreditChecker;
import design.pattern.abstractfactory.checker.IShippingChecker;
import design.pattern.factorymethod.ICreditCard;

public class CheckerFactoryCanada implements ICheckerFactory {
	
	public static class CreditCheckerCanada implements ICreditChecker {

		@Override
		public double creditLimit(ICreditCard creditCard) {
			return creditCard.cardLimit() - creditCard.cardBalance();
		}
	}
	
	public static class BillingCheckerCanada implements IBillingChecker {

		@Override
		public boolean isResidential() {
			return false;
		}
	}
	
	public static class ShippingCheckerCanada implements IShippingChecker {

		@Override
		public boolean hasTarrif() {
			return true;
		}
		
	}

	@Override
	public ICreditChecker createCreditChecker() {
		return new CreditCheckerCanada();
	}

	@Override
	public IBillingChecker createBillingChecker() {
		return new BillingCheckerCanada();
	}

	@Override
	public IShippingChecker createShippingChecker() {
		return new ShippingCheckerCanada();
	}

}
