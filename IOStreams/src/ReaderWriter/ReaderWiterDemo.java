package ReaderWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWiterDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("example.txt");
		FileWriter fw = new FileWriter("exam-new.txt");
		System.out.println("File Opened");
		int ch;
		while((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("File Closed");
	}
}
