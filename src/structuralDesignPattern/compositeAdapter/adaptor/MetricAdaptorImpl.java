package structuralDesignPattern.compositeAdapter.adaptor;

import structuralDesignPattern.compositeAdapter.existing.ImperialSystemIF;

public class MetricAdaptorImpl implements MetricAdaptorIF {
	ImperialSystemIF imperialSystem;

	public MetricAdaptorImpl(ImperialSystemIF imperialSystem) {
		this.imperialSystem = imperialSystem;
	}

	@Override
	public float imperialToMetric() {
		return (float) (imperialSystem.getWeight() * 0.45);
	}

}
