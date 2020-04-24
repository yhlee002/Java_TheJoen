package MyHomeWork200407;

import java.util.Arrays;

public class MyHomeWorkTest {
	public static void main(String[] args) {
		//MyHomeWork0
		MyHomeWork0 mhw0 = new MyHomeWork0("Younghyun", 26, 200);
		System.out.println(mhw0.returnName());
		System.out.println(mhw0.returnAge());
		System.out.println(mhw0.returnSalary());
		System.out.println(mhw0.returnAge10());
		System.out.println(mhw0.returnSalaryParam(15));
		//MyHomeWork1
		MyHomeWork1 mhw1 = new MyHomeWork1();
		mhw1.setName("HyeWon");
		mhw1.setAge(23);
		mhw1.setSalary(220);
		System.out.println(mhw1.getName());
		System.out.println(mhw1.getAge());
		System.out.println(mhw1.getSalary());
		System.out.println(mhw1.getAge10());
		System.out.println(mhw1.getSalaryParam(15));
		//MyHomeWork2
		MyHomeWork2 mhw2 = new MyHomeWork2();
		mhw2.setExplan("Hello");
		mhw2.setSum(10, 26, 13);
		mhw2.avg();
		mhw2.re_str();
		mhw2.print();
		//MyHomeWork3
		MyHomeWork3 mhw3 = new MyHomeWork3();
		mhw3.createArray();
		mhw3.sum();
		mhw3.getSum();
		System.out.println("getNums() : "+Arrays.toString(mhw3.getNums())+", getSum() : "+mhw3.getSum());
		//MyHomeWork4
		MyHomeWork4 mhw4 = new MyHomeWork4();
		System.out.println(mhw4.A(5));
		mhw4.B(3);
		mhw4.C(4);
		System.out.println(mhw4.returnStr());
		
	}
}
