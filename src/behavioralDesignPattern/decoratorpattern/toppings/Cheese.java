package behavioralDesignPattern.decoratorpattern.toppings;

import behavioralDesignPattern.decoratorpattern.pizza.BasePizzaIF;

public class Cheese extends ToppingAbs {

	public Cheese(BasePizzaIF pizza) {
		super(pizza);
	}

	@Override
	public String description() {
		return pizza.description() + " + Cheese";
	}

	@Override
	public Integer cost() {
		return pizza.cost() + 10;
	}

}
