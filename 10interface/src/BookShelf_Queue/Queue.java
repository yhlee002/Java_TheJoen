package BookShelf_Queue;

public interface Queue { //선입선출 ('예약' 서비스에 주로 사용됨)
	void enqueue(String title);
	
	String dequeue();
	
	int getSize();
}
