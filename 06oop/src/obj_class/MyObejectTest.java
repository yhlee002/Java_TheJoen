package obj_class;

public class MyObejectTest {
	public static void main(String[] args) {

		//myObj1
		MyObject myObj1 = new MyObject();
		myObj1.name = "일번";
		myObj1.id = 10;
		
		System.out.println("myObj1.id : "+myObj1.id+", myObj1.name : "+myObj1.name);
		System.out.println("myObj1 : "+myObj1);
		
		//myObj2
		MyObject myObj2 = new MyObject();
		myObj2.name = "이번";
		myObj2.id = 20;
		
		System.out.println("myObj2.id : "+myObj2.id+", myObj2.name : "+myObj2.name);
		System.out.println("myObj2 : "+myObj2);
		
		//intId
		int intId01 = 10;
		int intId02 = 20;
		
		System.out.println("intId02 : "+intId01);
		System.out.println("intId02 : "+intId02);
		
		//기본형 값을 변수에 전달
		intId01 = intId02;
		System.out.println("intId01 = intId02");
		System.out.println("intId01 : "+intId01);
		System.out.println("intId02 : "+intId02);
		
		intId02 = 30;
		System.out.println("intId02 = 30");
		System.out.println("intId01 : "+intId01);
		System.out.println("intId02 : "+intId02);
		
		System.out.println("---------------------");
		
		//참조형 변수
		myObj1 = myObj2;
		System.out.println("myObj1.id : "+myObj1.id);
		System.out.println("myObj1.name : "+myObj1.name);
		
		myObj2.id = 30;
		myObj2.name = "삼번";
		System.out.println("myObj1.id : "+myObj1.id);
		System.out.println("myObj1.name : "+myObj1.name);
		
		
	}
}
