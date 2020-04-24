package BookShelf_Queue;

public class Book {
	String name;
	int price;
	String author;
	
	public Book(String name, int price, String author) {
		this.name = name;
		this.price = price;
		this.author = author;
	}
	
	void setTitle(String name) {
		this.name = name;
	}
	String getTitle(){
		return name;
	}
	void setPrice(int price) {
		this.price = price;
	}
	int getPrice() {
		return price;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	String getAuthor() {
		return author;
	}
}
