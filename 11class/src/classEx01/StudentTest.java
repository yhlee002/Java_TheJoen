package classEx01;

import java.lang.reflect.*;

public class StudentTest {
	public static void main(String[] args) {
		Student st = new Student();
		Class s = st.getClass();//st라는 객체를 통해 class를 관리하는 Class 객체를 반환받음.
		Constructor[] cons = s.getConstructors();
		
		for(Constructor constructor : cons) {
			System.out.println(constructor.toString());
		}
		
		Field[] f = s.getFields();
		for(Field field : f) {
			System.out.println(field);
		}
		
		Method[] methods = s.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		
		
	}
}
