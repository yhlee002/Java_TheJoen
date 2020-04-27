package io05;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//ObjectOutputStream을 사용하기 위한 예제 2
public class ObjectOutputStreamTest {
	public static void main(String[] args) {
		//파일에 객체를 저장
		try(ObjectOutputStream oOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/io05/students")))) {
			Student s1 = new Student("나루토", 10);
			Student s2 = new Student("카카시", 30);
			
			//객체를 파일에 쓰자
			oOut.writeObject(s1);
			oOut.writeObject(s2);
			oOut.flush();
			System.out.println("객체를 파일에 저장했습니다.");
			//NotSerializableException(직렬화하게 만들어지지 않았다는 예외)
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
