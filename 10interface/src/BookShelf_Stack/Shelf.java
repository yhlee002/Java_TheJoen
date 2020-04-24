package BookShelf_Stack;

import java.util.ArrayList;

public class Shelf{
	protected ArrayList<Book> shelf;

	public Shelf() {
		shelf = new ArrayList<Book>();
	}
	
	public ArrayList<Book> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
	
	
}
