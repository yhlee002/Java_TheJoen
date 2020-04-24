package otherpackage;

import MyPackage.MyClass;

public class OtherPackYourClass {
	MyClass m; //import해야 사용 가능
	
	public OtherPackYourClass() {
		System.out.println(m.publicVar);
//		System.out.println(m.protectedVar);
//		System.out.println(m.defaultVar);
//		System.out.println(m.privateVar);
	}
	//패키지가 다르면 public만 사용할 수 있음.
}
