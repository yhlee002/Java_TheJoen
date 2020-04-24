package array05;

import java.util.Arrays;

public class ArrayCopy2 {
	public static void main(String[] args) {
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
//		System.out.println(array1);
//		System.out.println(array2);
//		array2 = array1;
//		System.out.println("-----------");
//		System.out.println(array1);
//		System.out.println(array2);
		System.arraycopy(array1, 0, array2, 3, 2);
		//arraycopy(복사 대상, (복사대상의)시작점, 복사할 곳, (복사할 곳의)시작점, 복사할 인덱스 수)
		//--> array1의 인덱스 0부터 (1까지) 2개를 array2의 인덱스 3부터 넣는다.
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		//2의 배수 10개가 있는 배열(a)을 만들고 1~10의 값이 들어간 배열(b)을 만들어
		//a배열의 index5부터 3개를 b배열 index 2번에 넣고 출력 ㄱㄱ
		int[] a = new int[10];
		int[] b = new int[10];
		
		
		for(int i = 1; i <= 10; i++) {
			a[i-1] = 2*i;
		}
		
		for(int i = 0; i < 10; i++) {
			b[i] = i+1;
		}
		
		System.arraycopy(a, 5, b, 2, 3);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		
		int[] arr1 = new int[]{1, 2, 3, 4, 5};
		int[] arr2 = new int[]{10, 20, 30, 40, 50};
		
		arraycopy(arr1, 2, arr2, 0, 2);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
	}
	
	public static void arraycopy(Object arr1,  int startNum,
            Object arr2, int destinationNum,
            int length) {
		int[] arr1new = (int[]) arr1;
		int[] arr2new = (int[]) arr2;
		
		for(int i=0; i<length; i++) {
			arr2new[i+destinationNum] = arr1new[i+startNum];
		}
		
		
		arr2 = arr2new;
	}

}
