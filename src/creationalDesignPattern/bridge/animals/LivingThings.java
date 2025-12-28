package creationalDesignPattern.bridge.animals;

import creationalDesignPattern.bridge.breathing.BreathImmplementorIF;

public abstract class LivingThings {
	BreathImmplementorIF breathImmplementorIF;
	
	public LivingThings(BreathImmplementorIF breathImmplementorIF) {
		this.breathImmplementorIF = breathImmplementorIF;
	}
	
	public abstract void breathProcess();
}
