package io01;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

public class ByteArrayInputStreamTestEx {
	public static void main(String[] args) {
		//1~20까지의 짝수 배열 생성하고, 그 배열을 인풋스트림으로 읽어 출력하는 코드 작성(반복문을 이용해 출력)
		byte[] arr = new byte[10];
		for(int i = 0; i <= 9; i++) {
			arr[i] = (byte) ((i+1)*2);
		}
		
		System.out.println("arr = "+Arrays.toString(arr));
		
		ByteArrayInputStream bArrStream = new ByteArrayInputStream(arr);
		
		System.out.print("읽은 값 : ");
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(bArrStream.read()+" ");
//		}
//		System.out.println("\n"+bArrStream.read()); //읽을 값이 더이상 없을때 -1 반환
		int  i = 0;
		while((i = bArrStream.read()) != -1) {
			System.out.print(i+" ");
		}
		
		
	}
}
