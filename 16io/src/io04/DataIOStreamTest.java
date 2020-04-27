package io04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataIOStreamTest {
	public static void main(String[] args) {
		File file = new File("src/io04/data");
		
		//아웃풋스트림객체 생성+보조스트림+보조스트림
		try(DataOutputStream dop = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
		/*
		 *  = FileOutputStream fos = new FileOutputStream(file);
		 * BufferedOutputStream bos = new BufferedOutputStream(fos);
		 * DataOutputStream dop = new DataOutputStream(bos)
		 */
			byte byteNum = 10;
			char ch = 'A';
			int intNum = 1000000;
			String name = "안녕하쇼";
			
			//아래 출력문들 중 String만 제대로 표시되고 다른 자료형들은 ascii code때문에 변형되어져 출력된다.
			dop.writeByte(byteNum);
			dop.writeChar(ch);
			dop.writeInt(intNum);
			dop.writeUTF(name); //Sting형 데이터를 출력할 수 있게 해준다.
			dop.flush();
			System.out.println("쓰기 완료!");
			
			//작성한 순서대로 읽어줘야 깨지지 않음(각 자료형의 바이트 수가 다르기 때문)
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
