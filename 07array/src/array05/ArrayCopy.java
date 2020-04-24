package array05;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] intArr = new int[10];
		
		//1~10의 수를 넣기
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = i+1;
		}
		System.out.println(Arrays.toString(intArr));
		
		//배열의 복사(얕은 복사, 깊은 복사)
		int[] intArrCopy;
		//cf. int[] intArrCopy = new int[10]; 이 코드가 있었으면 이로 인해 생성된 객체는 사용되지 않고 버려졌을것
		intArrCopy = intArr; //참조 주소만 복사
		intArrCopy[0] = 10; //[10, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println("intArr : "+Arrays.toString(intArr)); //참조주소를 공유하던 변수로 인해 값이 변경되고 그것이 영향을 미침
		System.out.println("numberCopy : "+Arrays.toString(intArrCopy));
		
		int[] intArrDeepCopy;//깊은 복사는 객체를 새로 생성해서 그 배열객체의 값 마다 참조값을 가진다.
		intArrDeepCopy  = new int[10];
		
		for(int i=0; i<intArrDeepCopy.length; i++) {
			intArrDeepCopy[i] = intArr[0];
		}
		
		System.out.println("-----------------------");
		System.out.println("intArr : "+Arrays.toString(intArr));
		System.out.println("intArrCopy : "+Arrays.toString(intArrCopy));
		
		intArrDeepCopy[9] = 100;
		System.out.println("@@@@@@@@@@intArrDeepCopy[9] = 100@@@@@@@@@@");
		System.out.println("intArr : "+Arrays.toString(intArr));
		System.out.println("intArrDeepCopy : "+Arrays.toString(intArrDeepCopy));
	}
}
