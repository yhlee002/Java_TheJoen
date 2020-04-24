package BookShelf_Queue;

public class BookTest {
	public static void main(String[] args) {
		BookShelf bs = new BookShelf();
		bs.enqueue("어린 왕자");
		bs.enqueue("강철의 연금술사");
		bs.enqueue("진격의 거인");
		
		System.out.println("getSize() : "+bs.getSize());
		System.out.println(bs.getShelf());
		
		bs.dequeue();
		
		System.out.println("getSize() : "+bs.getSize());
		System.out.println(bs.getShelf());
	}
	
	
}
