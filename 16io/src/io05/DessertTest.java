package io05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DessertTest {
	public static void main(String[] args) {
		Dessert ds1 = new Dessert("Cake", 6000, 2000);
		Dessert ds2 = new Dessert("macaron", 3500, 200);
		
		try(
			ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/io05/desserts")));
			
			){
			out.writeObject(ds1);
			out.writeObject(ds2);
			out.flush();
			
//			ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/io05/desserts")));
//			이렇게 try()에 생성하지 않고 try문 내에 생성할 경우 가능			
//			
//			Dessert d1 = (Dessert)in.readObject();
//			Dessert d2 = (Dessert)in.readObject(); 
//			
//			
//			System.out.println(d1);
//			System.out.println(d2);
		
		} catch (EOFException e) {
			System.out.println("모두 읽었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/io05/desserts")))) {
			Dessert d1 = (Dessert)in.readObject();
			Dessert d2 = (Dessert)in.readObject(); 
			
			System.out.println(d1);
			System.out.println(d2);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
