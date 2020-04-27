package io03_test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

//gugu.txt 파일에 구구단을 출력하는 코드를 작성하시오.(파일을 읽었을때 구구단을 읽을 수 있어야 함)

public class test {
	
	public static void main(String[] args) {
		/*
		 * ASCII Code 고려 않고, 모두 문자열로 만들어 출력할 수는?
		 * 문자열을 문자들의 집합으로 만들어서(String이 결국 char[]인 것 처럼)이를 ByteArrayInputStream으로 넣을 수 있을지 시도
		 * String.getBytes() : 인코딩된 byte형태로 넘겨줌(default charset)
		 * String.getBytes(Charset charset) : ISO-8859-1, euc-kr, utf-8 등의 charset 사용 가능
		 * String.getBytes(String charsetName)
		 * 
		 * String str을 생성, str을 getBytes()를 통해 byte형 배열에 넣으면서 문자열의 각 문자가 byte형태가 된다.
		 * 이것이 다시 출력될때 ascii code에 의해 문자들이 하나하나 인코딩 된다.
		 * (한글은 기본 인코딩셋으로는 깨지니, Charset지정 필요(UTF - 8)
		 */
		String str = "";
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				str += String.format("%2d x %d = %-3d\t",j, i, j*i);
			}
			str += "\n";
		}
		
		byte[] byteArr = str.getBytes();
//		System.out.println(Arrays.toString(byteArr));
		try(FileOutputStream fos = new FileOutputStream("src/io03_test/gugu.txt")) {
				fos.write(byteArr); 
				/*
				 * 만약 매개변수를 String으로 받아 받은 인자를 출력하는 메소드라면 String 생성자 
				 * 를 통해( = new String(byteArr)) byte타입의 배열을 String으로 decoding할 수 있다.
				 *  *14exception의 src.exception03.MyReader.java의 경우 System.in.read(byte[] array)를 통해 
				 *  읽은 내용을 byte형 배열에 담고, 이를 new String(array)를 통해 문자열로 변환한다.
				 * 
				 * 여기서는 문자열의 길이가 길고, byte배열의 크기를 짐작하기 어려워 getBytes()로 대체.
				 * 
				 */
//			fos.write(new String(byteArr));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
	}
}
