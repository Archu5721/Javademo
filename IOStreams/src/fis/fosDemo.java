package fis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fosDemo {
	public static void main(String[] args) {
		File myFile = new File("example.txt");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(myFile);
			System.out.println("File is opened");
			String data="Helloo!!";
			fos.write(data.getBytes());
			} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
				System.out.println("File Closed");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
