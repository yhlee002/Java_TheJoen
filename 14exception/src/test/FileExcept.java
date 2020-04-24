package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileExcept{
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		//Try catch finally
		try {
			fis = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Try catch finally [FileNotFoundException]");
		}finally {
				try {
					fis.close(); 
				} catch (IOException e) {
					System.out.println("Try catch finally [IOException]");
				} catch (NullPointerException e) {
					System.out.println("Try catch finally [NullPointerException]");
				}
		}
		
		//Try with resource
		try(FileInputStream fs = new FileInputStream("test2.txt")) {
			
		} catch (FileNotFoundException e) {
			System.out.println("Try with resource [FileNotFoundException]");
		} catch (IOException e1) {
			System.out.println("Try with resource [IOException]");
		}
		
	}
}