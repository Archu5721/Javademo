package fis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDemo {
	public static void main(String[] args) {
		File myFile = new File("E:\\Javafsd\\example.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(myFile);
			System.out.println("File is opened");
			int i;
			while((i = fis.read()) != -1){
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				System.out.println("File Closed");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
