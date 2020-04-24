package inheritance01;
class A {
	int a;
	int b;
	int c;
	
	void funcA() {
		System.out.println(a);
	}
	void funcB() {
		System.out.println(b);
	}
	void func() {
		System.out.println(c);
	}
	
}
class B extends A{
//	int a;
//	int b;
//	int c;
	int d;
	int e;
	
//	void funcA() {
//		System.out.println(a);
//	}
//	void funcB() {
//		System.out.println(b);
//	}
//	void func() {
//		System.out.println(c);
//	}
	void funcD() {
		System.out.println(d);
	}
	
}
public class InheritanceTest {
	public static void main(String[] args) {
		A aClass = new A();
		aClass.a = 10;
		aClass.b = 20;
		aClass.c = 30;
		aClass.funcA();
		
		B bClass = new B();
		bClass.a = 100;
		bClass.b = 200;
		bClass.c = 300;
		bClass.d = 400;
		bClass.e = 500;
		bClass.funcA();
		
	}
}
