package BookShelf_Queue;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enqueue(String title) {
		shelf.add(title);
		
	}

	@Override
	public String dequeue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

//	implements Stack 의 경우
//	@Override
//	public Book pop() {
//		if(shelf.size() == 0) {
//			return null;
//		}else {
//			return shelf.remove(shelf.size() - 1);
//		}
//	}
//
//	@Override
//	public void push(Book book) {
//		shelf.add(book);
//		
//	}
	
	

}
