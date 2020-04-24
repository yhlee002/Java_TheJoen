package array01;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest01 {
	//크기가 15개인 배열(0~14)
	//인덱스가 3의 배수일때 1~10의 수 중 랜덤으로 숫자를 넣고
	//인덱스가 3의 배수가 아닐때 100부터 1씩 증가하는 수 넣기
	public static void main(String[] args) {
		int[] arr = new int[15];
		Random ran = new Random();
		int n = 100;
		for(int i = 0; i < arr.length; i++) {
			if(i % 3 == 0) {
				if(i == 0) {
					arr[i] = n++;
				}else {
					arr[i] = ran.nextInt(11);
				}
				
			}else {
				arr[i] = n++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
}
