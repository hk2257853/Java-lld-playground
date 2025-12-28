package creationalDesignPattern.bridge;

import creationalDesignPattern.bridge.animals.Dog;
import creationalDesignPattern.bridge.animals.Fish;
import creationalDesignPattern.bridge.breathing.LandBreath;
import creationalDesignPattern.bridge.breathing.WaterBreath;

public class Main {
	public static void main(String[] args) {
		Fish myFish = new Fish(new WaterBreath());
		myFish.breathProcess();

		Dog dog = new Dog(new LandBreath());
		dog.breathProcess();
	}
}
