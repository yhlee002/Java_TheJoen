package io04;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//BufferedInputStream(보조 Stream) : 내용을 읽어 버퍼에 담아두는 역할
public class BufferedInputStreamTest {
	public static void main(String[] args) {
		/*
		 * 보조 스트림은 데이터 입출력 스트림과 연결해서 사용한다.
		 * File -> 데이터 싱크 스트림(기반 스트림) -> 보조스트림
		 * 
		 */
		File file = new File("src/io04/data.txt");
		
		//기반 스트림 변수 선언
		FileOutputStream fos = null;
		
		//보조스트림 변수 선언
		BufferedOutputStream bout = null;
		
		try {
			//파일과 기반스트림 연결
			fos = new FileOutputStream(file);
			
			//보조 스트림과 연결
			bout = new BufferedOutputStream(fos);
			// BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("src/io04/data.txt"));
			
			//파일에 작성할 내용 입력
			bout.write(97);
			System.out.println("파일을 작성했습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fos != null && bout != null) {
				try {
					bout.close();
					fos.close();
					//close해주는 순서가 중요(bout부터 닫고 그 인자로 받아진 fos를 닫아야 StreamCloseException발생하지 않음
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			//bout을 close해주지 않으면 작성되지 않는것이 정상
		}
		
	}
}
