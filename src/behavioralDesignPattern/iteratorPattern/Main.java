package behavioralDesignPattern.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

import behavioralDesignPattern.iteratorPattern.book.Book;
import behavioralDesignPattern.iteratorPattern.book.BookAggregate;
import behavioralDesignPattern.iteratorPattern.book.BookAggregateIF;
import behavioralDesignPattern.iteratorPattern.iterator.IteratorIF;

public class Main {
	public static void main(String[] args) {

		Book b1 = new Book("book1", 1, "auth1");
		Book b2 = new Book("book2", 2, "auth2");
		Book b3 = new Book("book3", 3, "auth3");

		List<Book> bookList = new ArrayList<>();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);

		BookAggregateIF bookAggregate = new BookAggregate(bookList);
		IteratorIF bookIterator = bookAggregate.createIterator();
		
		
		while(bookIterator.hasNext()) {
			 System.out.println(bookIterator.next().toString());
		}
		
		
	}

}
