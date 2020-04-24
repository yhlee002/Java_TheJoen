package otherpackage;

import MyPackage.MyClass;

public class MySubClass extends MyClass {
	public MySubClass(){
		System.out.println(publicVar);
		System.out.println(protectedVar); //다른 패키지지만 상속을 받으면 사용가능
//		System.out.println(defaultVar);
//		System.out.println(privateVar);
	}
}
