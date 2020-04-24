package io01_2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Stream {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[배열의 요솟수 입력]");
		byte[] array = new byte[sc.nextInt()];
//		sc.nextLine();
		for(int i = 0 ; i < array.length; i++) {
			System.out.println("array["+i+"] : ");
			array[i] = (byte) sc.nextInt();
//			sc.nextLine();
		}
		System.out.println("배열 확인 : "+Arrays.toString(array));
		
		ByteArrayInputStream bis = new ByteArrayInputStream(array);

		System.out.println("array의 내용을 역순으로 copyArr에 복사");
		byte[] copyArr = new byte[array.length];
		for(int i = array.length - 1; i >= 0; i--) {
			int x = bis.read();
			copyArr[i] = (byte)x;
		}
		System.out.println("copyArr : "+Arrays.toString(copyArr));
		
		byte[] copyArr2 = new byte[copyArr.length];
		ByteArrayInputStream bis2 = new ByteArrayInputStream(copyArr);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		System.out.println("copyArr1의 내용을 copyArr2에 복사");
		for(int i = 0; i < copyArr.length; i++) {
			int y = bis2.read();
			bos.write(y);
		}
		copyArr2 = bos.toByteArray();
		System.out.println("copyArr2 : "+Arrays.toString(copyArr2));
		
		
		
		sc.close();
	}
}
