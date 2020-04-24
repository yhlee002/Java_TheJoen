public class LoopTest13 {
	public static void main(String[] args) {
		int button;
		for (int i=0; i<4; i++) {
			button = (i%2==0)?0:1;
			switch (button) {
			case 0:
				for (int j=1; j<=5; j++) {
					System.out.print(j+(i*5) + "\t");
				}
				break;
			case 1:
				for (int j=0; j<=4; j++) {
					System.out.print(((i+1)*5)-j + "\t");
				}
				break;
			}
			System.out.println();
		}
	}
}