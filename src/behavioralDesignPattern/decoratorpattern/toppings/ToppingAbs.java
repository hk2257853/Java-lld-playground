package behavioralDesignPattern.decoratorpattern.toppings;

import behavioralDesignPattern.decoratorpattern.pizza.BasePizzaIF;

public abstract class ToppingAbs implements BasePizzaIF {
	BasePizzaIF pizza;
	
	ToppingAbs(BasePizzaIF pizza) {
		this.pizza = pizza; // reference of pizza we want to decorate
	}
}
