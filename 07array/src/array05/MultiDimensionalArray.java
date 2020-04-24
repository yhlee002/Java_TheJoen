package array05;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		//이차원배열
		int[][] numbers = new int[2][2]; //[행][열]
		numbers[0][0] = 1;
		numbers[0][1] = 2;
		numbers[1][0] = 3;
		numbers[1][1] = 4;
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j]);
			}
			System.out.println();
		}
		
		//배열은 자료형만 같으면 길이는 얼마든지 정할 수 있음.
		int[] nums;
		nums = new int[5];
		nums = new int[3];
		nums = new int[10];
		
		//위의 내용은 이차원배열에서도 같음.
		int[][] numsArray = new int[3][];
		numsArray[0] = new int[5];
		numsArray[1] = new int[3];
		
	}
}
