package design.pattern.abstractfactory.check;

public interface ICheckFactory {
	ICreditCheck createCreditCheck();
	IBillingCheck createBillingCheck();
	IShippingCheck createShippingCheck();
}
