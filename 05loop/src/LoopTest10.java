public class LoopTest10 {
	public static void main(String[] args) {
		for (int i=0; i<4; i++) {
			for (int j=12; j>(i*4); j--) {
				System.out.print(" ");
			}
			for (int j=0; j<(i*4)+1; j++) {
				if(j%4==0) {
					System.out.print("*");
					continue;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}