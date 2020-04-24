package BookShelf_Stack;

public class BookTest {
	public static void main(String[] args) {
		BookShelf bs = new BookShelf();
		Book b1 = new Book("어린 왕자", 4000, "몰라1");
		bs.push(b1);
		bs.push(new Book("진격의 거인", 3000, "몰라2"));
		bs.push(new Book("강철의 연금술사", 5000, "몰라3"));
		
		System.out.println("[bs.toString Override] : "+bs);
		for(Book book : bs.getShelf()) {
			System.out.print(book.getTitle()+" ");
			System.out.print(book.getPrice()+" ");
			System.out.println(book.getAuthor());
		}
		Book b = bs.pop();
		System.out.println(b.getTitle()+" : "+b.getPrice()+" : "+b.getAuthor());
	}
}
