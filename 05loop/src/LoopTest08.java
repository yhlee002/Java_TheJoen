public class LoopTest08 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<(i*3)+1; j++) {
				if(j%3==0) {
					System.out.print("*");
					continue;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}