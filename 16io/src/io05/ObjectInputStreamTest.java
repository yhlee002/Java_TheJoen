package io05;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {
	public static void main(String[] args) {
		try(ObjectInputStream oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/io05/students")))) {
			Student s1 = (Student)oin.readObject();
			Student s2 = (Student)oin.readObject();
			System.out.println(s1); 
			System.out.println(s2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
