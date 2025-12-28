package behavioralDesignPattern.decoratorpattern.pizza;

import behavioralDesignPattern.decoratorpattern.toppings.Cheese;

public class Main {
	public static void main(String[] args) {
		BasePizzaIF myPizza = new Cheese(new PizzaA());
		myPizza = new Cheese(myPizza);
		System.out.println("Cost: " + myPizza.cost());
		System.out.println("Description: " + myPizza.description());
	}
}
