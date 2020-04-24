public class LoopTest12 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<=10; i++) {
			if(i==1) {
				sum += 1;
				System.out.print(i);
				continue;
			}
			System.out.print("+");
			System.out.print("(");
			for(int j=1; j<=i; j++) {
				sum += j;
				if(j==1) {
					System.out.print(j);
					continue;
				}
				System.out.print("+");
				System.out.print(j);
			}
			System.out.print(")");
		}
		System.out.print(" = "+sum);
	}
}