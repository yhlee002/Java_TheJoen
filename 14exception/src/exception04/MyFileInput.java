package exception04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyFileInput {
	public void readFile() throws Exception { //FileNotFoundException -> Exception으로 표현해도됨. 다형성!!!
		FileInputStream fis = new FileInputStream("text.txt");
	}
}
