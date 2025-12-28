package behavioralDesignPattern.iteratorPattern.book;

import behavioralDesignPattern.iteratorPattern.iterator.IteratorIF;

public interface BookAggregateIF {
	public IteratorIF createIterator();
}