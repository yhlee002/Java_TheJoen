package io04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 학생이름
 * 과목명
 * 성적
 * 과목명
 * 성적
 * 과목명
 * 성적
 * 위의 형태로 파일에 작성하고 읽어서
 * 과목명 : 성적, 과목명 : 성적, 과목명 : 성적
 * 이름 : OO
 * 평균 : OO
 * 위와 같이 출력하도록 하시오.
 */
class Student{
	String name;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor; this.eng = eng; this.math = math;
	}
}

public class DataIOStreamTestEx {
	public static void main(String[] args) {
		Student[] stArr = new Student[3];
		stArr[0] = new Student("조로", 100, 90, 60);
		stArr[1] = new Student ("루피", 60, 30, 50);
		stArr[2] = new Student("나미", 100, 80, 90);
		
		String[] StringArr = new String[3];
		for(int i = 0; i < 3; i++) { 
			int avg = (stArr[i].kor+stArr[i].eng+stArr[i].math)/3;
			StringArr[i] = "[Kor]\n"+stArr[i].kor+"\n[Eng]\n"+stArr[i].eng+"\n[Math]\n"+stArr[i].math+"\n[이름] : "+stArr[i].name+"\n[평균] : "+avg+"\n";
		}
		
		try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/io04/data2")));
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("src/io04/data2")))) {
			for(int i = 0; i < 3; i++) {
				dos.writeUTF(StringArr[i]);
			}
			dos.flush();
			
			for(int i = 0; i < 3; i++) {
				System.out.println(dis.readUTF());
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
