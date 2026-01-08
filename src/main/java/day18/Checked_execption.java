package day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Checked_execption {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("E:\\myfile.txt");
		int i = file.read();
		System.out.println(i);

		FileOutputStream write = new FileOutputStream("E:\\\\myfile.txt");
		
		
	}

}
