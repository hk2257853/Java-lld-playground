package behavioralDesignPattern.iteratorPattern.book;

import java.util.List;

import behavioralDesignPattern.iteratorPattern.iterator.BookIterator;
import behavioralDesignPattern.iteratorPattern.iterator.IteratorIF;

public class BookAggregate implements BookAggregateIF {

	List<Book> bookList;

	public BookAggregate(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public IteratorIF createIterator() {
	    return new BookIterator(bookList);
	}

}
