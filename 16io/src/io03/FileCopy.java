package io03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

public class FileCopy {

	public static void main(String[] args) {
		//파일 복사(원본을 읽어와 새 파일에 씀) - 파일 이름을 변수에 안넣어도 되지만 코드가 보다 보기 좋게 하기 위해 작성
		String originFile = "src/io03/picture1.jpg";
		
		//중복되지 않는 아이디 만들기(UUID)
		String uuid = UUID.randomUUID().toString(); 
		System.out.println("uid : "+uuid);
		
		//복사할 파일 위치와 이름
		String copyFile = "src/io03/+"+uuid+"_copy.jpg";
		
		
		//읽고 쓰기 위한 스트림객체 준비
		//인풋스트림은 원본 파일에 연결, 아웃풋스트림은 복사할 파일 위치로 연결
		try(FileInputStream in = new FileInputStream(originFile);
			FileOutputStream out = new FileOutputStream(copyFile);){
			
			byte[] buf = new byte[512];
			int length;
			while((length = in.read(buf)) != -1) {
				//읽은 파일을 그대로 파일에 작성
				out.write(buf, 0, length);
			}
			System.out.println("File Copy End");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
