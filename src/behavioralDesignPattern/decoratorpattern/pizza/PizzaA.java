package behavioralDesignPattern.decoratorpattern.pizza;

public class PizzaA implements BasePizzaIF {

	@Override
	public String description() {
		return "PizzaA";
	}

	@Override
	public Integer cost() {
		return 30;
	}

}
