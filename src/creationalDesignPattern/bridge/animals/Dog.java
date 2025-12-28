package creationalDesignPattern.bridge.animals;

import creationalDesignPattern.bridge.breathing.BreathImmplementorIF;

public class Dog extends LivingThings {

	public Dog(BreathImmplementorIF breathImmplementorIF) {
		super(breathImmplementorIF);
	}

	@Override
	public void breathProcess() {
		System.out.println("Dog: ");
		breathImmplementorIF.breath();
	}

}
