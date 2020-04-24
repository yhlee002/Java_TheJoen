package exception01;

public class Exception03 {
	public static void main(String[] args) {
		/*배열의 예외를 처리하자.(try ~ catch)
		 * try{
		 * 		예외가 발생할 수 있는 코드
		 * }catch(처리할 예외 타입 e){
		 * 		예외처리를 하는 부분
		 * }
		 */
		
		int[] arr = new int[5];
		try {
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("e.getMessage() : "+e.getMessage());
			System.out.println("e.toString() : "+e.toString());
			System.out.print("e.printStackTrace() : ");
			e.printStackTrace();
			
		}
	}
	
}
