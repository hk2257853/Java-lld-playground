package creationalDesignPattern.bridge.breathing;

public class WaterBreath implements BreathImmplementorIF {

	@Override
	public void breath() {
		System.out.println("Gills are breathing");
	}

}
