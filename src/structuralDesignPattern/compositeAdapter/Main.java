package structuralDesignPattern.compositeAdapter;

import structuralDesignPattern.compositeAdapter.adaptor.MetricAdaptorIF;
import structuralDesignPattern.compositeAdapter.adaptor.MetricAdaptorImpl;
import structuralDesignPattern.compositeAdapter.existing.ImperialSystemIF;
import structuralDesignPattern.compositeAdapter.existing.ImperialSystemImpl;

public class Main {

	public static void main(String[] args) {
		ImperialSystemIF imperialSystem = new ImperialSystemImpl(10);
		System.out.println("Imperial weight = " + imperialSystem.getWeight());
		
		MetricAdaptorIF metricAdaptor = new MetricAdaptorImpl(imperialSystem);
		System.out.println("Converted to metric: " + metricAdaptor.imperialToMetric());
	}
}
