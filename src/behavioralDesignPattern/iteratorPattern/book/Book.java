package behavioralDesignPattern.iteratorPattern.book;

public class Book {
	private String name;
	private Integer id;
	private String author;

	public Book(String name, Integer id, String author) {
		this.name = name;
		this.id = id;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", id=" + id + ", author=" + author + "]";
	}

}
