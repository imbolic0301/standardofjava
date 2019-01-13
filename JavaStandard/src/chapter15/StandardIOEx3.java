package chapter15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StandardIOEx3 {
	public static void main(String[] args) {
		PrintStream      ps  = null;
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("C:\\Users\\ChoiHongjun\\git\\standardofjava\\JavaStandard\\src\\chapter15\\test.txt");
			ps  = new PrintStream(fos);
			System.setOut(ps);    //  System.out�� ��´���� test.txt���Ϸ� ����
		} catch(FileNotFoundException e) {
			System.err.println("File not found.");
		}

		System.out.println("Hello by System.out");		
		System.err.println("Hello by System.err");		
	}
}