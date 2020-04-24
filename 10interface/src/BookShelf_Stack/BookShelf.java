package BookShelf_Stack;

public class BookShelf extends Shelf implements Stack{

	@Override
	public Book pop() {
		if(shelf.size() == 0) {
			return null;
		}else {
			return shelf.remove(shelf.size() - 1); //ArrayList.remove() : 제거가 됨과 동시에 제거되는 대상이 리턴됨
		}
	}

	@Override
	public void push(Book book) {
		shelf.add(book);
		
	}
	
	@Override
	public String toString() {
		
		return shelf.toString();
		
//		String str = "";
//		for(int i = 0; i < shelf.size(); i++) {
//			str = str+shelf.get(i)+" ";
//		}
//		return str;
	}
}
