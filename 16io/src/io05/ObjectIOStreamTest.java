package io05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectIOStreamTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("트위스트페이트", 30));
		list.add(new Student("브랜드", 100));
		list.add(new Student("직스", 50));
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/io05/listStudent")))){
			
			//리스트를 통해 파일에 쓴다.
			//Student클래스가 직렬화되도록 설정되어야한다.(serializable 구현)
			oos.writeObject(list);
			oos.flush();
			System.out.println("파일 작성 끝!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/io05/listStudent")))){
//			System.out.println((ArrayList<Student>)ois.readObject());
			ArrayList<Student> st = (ArrayList<Student>) ois.readObject();
			
//			ArrayList<Integer> AgeArr = new ArrayList<Integer>();
			for(int i = 0; i < st.size(); i++) {
				System.out.println(st.get(i).getName()+"학생의 나이는 "+st.get(i).getAge()+"살 입니다.");
//				AgeArr.add(st.get(i).getAge());
			}
			int H = 0;
			String N = "";
			for(int i = 0; i < st.size() - 1; i++) {
				H = st.get(i).getAge() < st.get(i+1).getAge() ? st.get(i+1).getAge() : st.get(i).getAge();
			}
			
			for(int i = 0; i < st.size(); i++) {
				if(st.get(i).getAge() == H) {
					N = st.get(i).getName();
				}
			}
			
			System.out.println("가장 나이가 많은 학생은 "+N+"이며, "+H+"살 입니다.");
		} catch (EOFException e) {
			System.out.println("모두 읽었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
