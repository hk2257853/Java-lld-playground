package creationalDesignPattern.bridge.breathing;

public class LandBreath implements BreathImmplementorIF {

	@Override
	public void breath() {
		System.out.println("Opening lungs for breathing");
	}

}
