package io04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest02 {
	public static void main(String[] args) {

		String nums = "";
		for(int i = 0; i < 1024; i++) {
			nums += ""+(i+1)+" ";
		}
		byte[] arr = nums.getBytes(); 
		
		File file = new File("src/io04/data01.txt");
		//숫자(int) 1~1024까지를 파일 data01.txt파일에 쓰고 읽는 코드를 작성하시오.
		try(FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			/*
			 * Buffer는 기본적으로 8키로바이트짜리 양동이.(8키로바이트 = 8*1024바이트)
			 * 양동이가 꽉 차면 더이상 데이터가 들어가지 않는다.
			 * 꽉 찬 상태로 또다시 입력하게 되면 양동이는 8키로바이트 만큼 비어지고, 새로 작성한 데이터가 들어간다.
			 * 
			 * buffer가 비워지는 세 가지 경우
			 * 1)8키로 바이트가 넘었을 시 안에 있는 8키로 바이트를 쓴다.
			 * 2)버퍼를 close할때 버퍼에 남은 내용을 쓴다.
			 * 3)flush() : 버퍼속의 내용을 비우는 작업을 수행한다.(버퍼를 꽉 채우는 작업을 한게 아니라면 flush를 해주면 된다.)
			 */

			bos.write(arr);
			
			System.out.println("파일을 작성했습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//try with resource가 아닌 try catch finally를 사용할 경우 bos를 close해야 작성이되고, fos를 close해줄 경우 작성되지 않는다.
		
		try(FileInputStream fin = new FileInputStream(file); BufferedInputStream bin = new BufferedInputStream(fin);){
			int c = 0;
			while((c = bin.read()) != -1) {
				System.out.print(c+" ");
				if(c%10 == 0) {
					System.out.println();
				}
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
