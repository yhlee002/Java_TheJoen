package array02_Test02;
import java.io.*;
public class Person2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("반복할 횟수");
		bw.flush();
		int N = Integer.parseInt(br.readLine());
		
		String[] hobby = new String[N];
		
		bw.write("취미를 입력하시오.");
		bw.flush();
		
		bw.write("[ Hobby : ");

		for(int i = 0 ; i < hobby.length; i++) {
			hobby[i] = br.readLine();
			bw.write(hobby[i]+" ");	
		}
		bw.write("]");
		bw.flush();
		bw.close();
		
	}
}
