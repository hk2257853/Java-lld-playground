package creationalDesignPattern.bridge.animals;

import creationalDesignPattern.bridge.breathing.BreathImmplementorIF;

public class Fish extends LivingThings {

	public Fish(BreathImmplementorIF breathImmplementorIF) {
		super(breathImmplementorIF);
	}

	@Override
	public void breathProcess() {
		System.out.println("Fish: ");
		breathImmplementorIF.breath();
	}

}
