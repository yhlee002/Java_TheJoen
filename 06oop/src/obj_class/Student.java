package obj_class;

public class Student{
		/*
		 * 클래스(class) : 객체에 대한 속성과 기능을 코드로 구현한 것(객체에 대한 청사진)
		 * 
		 *  객체의 속성 : 객체의 특성(property = 속성(attribute) =멤버 변수(member-variable))
		 * 	객체의 기능 : 객체가 하는 기능(method - member function)
		 * 
		 * 
		 *  - 기본형 변수를 만들고 초기화하면 스텍메모리에 저장된다.(스텍메모리가 자료형의 크기만큼 할당)
		 *  ex. int num = 100; 일 경우 4byte
		 *  - 참조 변수는 객체의 주소가 들어갈 수 있는 공간을 만들고 new연산자를 통해 생성된 객체는 힙 메모리에 저장된다.
		 * 	(클래스명 객체명; 으로 변수를 선언했을때는 스텍메모리에 저장되나, new 연산자를 통해 인스턴스를 만들면 이 객체는 힙 메모리에 저장.)
		 *  - 선언한 변수에 new 인스턴스를 통해 만든 객체의 값을 넣으면 이 변수에는 실제 인스턴스가 아닌 인스턴스의 주소
		 * 	(print(객체명)을 했을때 @뒤에 나오는 부분)이(가) 들어가게 된다.
		 * (새로 생성된 인스턴스의 크기는 스텍메모리에서 구현될 수 있는 크기가 아니기 때문에 직접 들어가지 못하고 참조
		 * 할 수 있는 주소를 주는 것.)
		 *
		 *cf. 연결이 끊어진 객체(인스턴스)들의 메모리를 비워주는 역할을 하는 것이 자바에서는 garbage collector 	
		 */
		String name;
		int age;
		int id;
}
