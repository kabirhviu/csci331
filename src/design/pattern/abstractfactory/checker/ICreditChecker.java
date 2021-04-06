package design.pattern.abstractfactory.checker;

import design.pattern.factorymethod.ICreditCard;

public interface ICreditChecker {
	double creditLimit(ICreditCard iCreditCard);
}
