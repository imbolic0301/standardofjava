package chapter15;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx2 {
	public static void main(String args[]) {
		//	      ��ȣ, ����, ����, ����					
		int[] score = {	1, 100,  90,  90,
				    2,  70,  90, 100,
					3, 100, 100, 100, 
					4,  70,  60,  80, 
					5,  70,  90, 100 }; 
		
		try {
		RandomAccessFile raf = new RandomAccessFile("C:\\Users\\ChoiHongjun"
				+ "\\git\\standardofjava\\JavaStandard\\src\\chapter15\\score2.dat", "rw");
		
		for(int i=0; i<score.length;i++) {
		       raf.writeInt(score[i]);				
		}
		
		while(true) {
		   System.out.println(raf.readInt());
		}
		} catch (EOFException eof) {
		 // readInt()�� ȣ������ �� �� �̻� ���� ������ ������ EOFException�� �߻�
		} catch (IOException e) {
		 e.printStackTrace();		
		}
	} 
}