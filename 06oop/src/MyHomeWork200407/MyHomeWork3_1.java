package MyHomeWork200407;

import java.util.Arrays;

public class MyHomeWork3_1 {
	public static void main(String[] args) {
		MyHomeWork3 mhw3 = new MyHomeWork3();
		mhw3.createArray();
		mhw3.sum();
		mhw3.getSum();
		System.out.println("getNums() : "+Arrays.toString(mhw3.getNums())+", getSum() : "+mhw3.getSum());
	}
}
