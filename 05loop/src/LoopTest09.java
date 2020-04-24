public class LoopTest09 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<(i*5)+1; j++) {
				if(j%5==0) {
					System.out.print((j/5)+1);
					sum += (j/5)+1;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println(sum);
	}
}