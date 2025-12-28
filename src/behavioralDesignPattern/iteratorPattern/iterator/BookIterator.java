package behavioralDesignPattern.iteratorPattern.iterator;

import java.util.List;

import behavioralDesignPattern.iteratorPattern.book.Book;

public class BookIterator implements IteratorIF {
	private List<Book> bookList; // no access modifier means Only within the same package. private means within class
	private Integer index;

	public BookIterator(List<Book> bookList) {
		this.bookList = bookList;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < bookList.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Book next() {
		Book currentBook = bookList.get(index);
		index++;
		return currentBook;
	}

}
