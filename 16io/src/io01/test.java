package io01;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

public class test {
	
	static void reverse(byte[] array) {
		for(int i = 0; i < array.length/2; i++) {
			byte x = array[i];
			array[i] = array[array.length - (i+1)];
			array[array.length - (i+1)] = x;
		}
	}
	
	public static void main(String[] args) {
		//1~127까지 숫자가 들어있는 배열을 생성
		//copyArray를 만들어
		//InputStream 을 이용해서 역순으로 들어가도록 하시오.
		byte[] arr2 = new byte[127];
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = (byte)(i+1);
		}
//		reverse(copyArray);	
		
		ByteArrayInputStream bs = new ByteArrayInputStream(arr2);
		byte[] copyArray = new byte[arr2.length];
		for(int i = arr2.length -1 ; i >= 0 ; i--) {
			copyArray[i] = (byte) bs.read();
		}
		System.out.print("역순으로 정렬(InputStream 사용) : [");
		for(byte b : copyArray) {
			if(b == copyArray[copyArray.length - 1]) {
				System.out.print(b);
			}else {
				System.out.print(b+", ");
			}
		}
		System.out.println("]끝!");
		
		
		System.out.println("역순으로 정렬(method 사용) : "+Arrays.toString(copyArray));
		
		
	}
}

