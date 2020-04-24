package array01;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
	public static void main(String[] args) {
//		int num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5;
//		System.out.println(num1+", "+num2+", "+num3+", "+num4+", "+num5);
		
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.print(numbers[i*2]+" ");
		}
		
		System.out.println();
		
		//크기가 10인 배열에 인덱스가 짝수인 i는 2, 4, 6, 8, 10, 12가 들어가고 
		//홀수인 i는 랜덤으로 1~5까지
		
		Random ran = new Random();
		
		int[] test = new int[10];
		int i;
		for(i = 0; i < 5; i++) {
			test[i*2] = 2*(i+1); //2, 4, 6, 8, 10
		}
		for(i = 1; i <= 5; i++) {
			test[2*i-1] = ran.nextInt(6); 
			//(int) Math.random()*개수 + 시작 숫자) 
			//ex) 1~5라면 (int) Math.random()*5+1 -> '0이상 1미만'에서 '1이상 6미만'이 됨
		}
		
		System.out.println(Arrays.toString(test));

		int[] test2 = new int[10];
		int num2 = 1;
		for(i = 0; i < 5; i++) {
			test2[num2] = (int)(Math.random()*5+1);
			num2 = num2 + 2;
		}
		System.out.println(Arrays.toString(test2));
		
		for(i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				test[i] = i+2;
			}else {
				test[i] = (int)(Math.random()*5+1);
			}
		}
	}
}
