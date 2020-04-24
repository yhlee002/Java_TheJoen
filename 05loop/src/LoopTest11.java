public class LoopTest11 {
	public static void main(String[] args) {
		int sum = 0;
		int superSum = 0;
		for (int i=0; i<4; i++) {
			for(int j=4; j>i+1; j--) {
				System.out.print("\t");
			}
			for(int j=0; j<i+1; j++) {
				sum += 3;
				superSum += sum;
				System.out.print(sum+"\t");
				}
			System.out.println();
		}
		System.out.println(superSum);
	}
}