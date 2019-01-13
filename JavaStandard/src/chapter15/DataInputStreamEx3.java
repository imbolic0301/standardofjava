package chapter15;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx3 {
	public static void main(String args[]) {
		int sum   = 0;
		int score = 0;

		try (FileInputStream fis = new FileInputStream("C:\\Users\\ChoiHongjun\\git\\standardofjava"
	            + "\\JavaStandard\\src\\chapter15\\sample.dat");
		     DataInputStream dis = new DataInputStream(fis)) 
		{
			
			while(true) {
				score = dis.readInt();
				System.out.println(score);	
				sum += score;
			}
		} catch (EOFException e) {
			System.out.println("Á¡¼öÀÇ ÃÑÇÕ : " + sum );
		} catch (IOException ie) {
			ie.printStackTrace();
		} 
	} 
}