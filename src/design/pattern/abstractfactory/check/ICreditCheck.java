package design.pattern.abstractfactory.check;

import design.pattern.factorymethod.ICreditCard;

public interface ICreditCheck {
	double creditLimit(ICreditCard iCreditCard);
}
