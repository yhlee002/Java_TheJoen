package exceptionTest;

public class MakeArrayException{
	public void make() throws ArrayIndexOutOfBoundsException {
		int[] arr = new int[0];
		for (int i=0; i<1; i++) {
			arr[i] = i;
		}
	}
}
