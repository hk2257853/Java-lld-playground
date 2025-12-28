package behavioralDesignPattern.iteratorPattern.iterator;

import behavioralDesignPattern.iteratorPattern.book.Book;

public interface IteratorIF {
	public boolean hasNext();

	public Book next();
}
