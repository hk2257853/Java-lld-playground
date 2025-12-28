package structuralDesignPattern.compositeAdapter.existing;

public class ImperialSystemImpl implements ImperialSystemIF {
	float weight;

	public ImperialSystemImpl(float weight) {
		this.weight = weight;
	}

	@Override
	public float getWeight() {
		return weight;
	}

}
