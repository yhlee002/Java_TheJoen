package MyHomeWork200407;

public class MyHomeWork6 {
	public static void main(String[] args) {
		int[] arr = new int[7];
		arr[0] = 6;
		arr[1] = 7;
		arr[2] = 8;
		arr[3] = 9;
		arr[4] = 10;
		arr[5] = 11;
		arr[6] = 12;
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum : "+sum);
		System.out.println("avg : "+sum/arr.length);
		
	}
}
