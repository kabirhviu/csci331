package design.pattern.abstractfactory.checker;

public interface ICheckerFactory {
	ICreditChecker createCreditChecker();
	IBillingChecker createBillingChecker();
	IShippingChecker createShippingChecker();
}
