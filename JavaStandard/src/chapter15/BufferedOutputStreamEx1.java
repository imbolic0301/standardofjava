package chapter15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx1 {
	public static void main(String args[]) {
		try {
		     FileOutputStream fos = new FileOutputStream("C:\\Users\\ChoiHongjun\\git\\standardofjava"
		    		 + "\\JavaStandard\\src\\chapter15\\123.txt");
		     // BufferedOutputStream�� ���� ũ�� 5
		     BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
		     // ���� 123.txt�� 1~9 ���
		     for(int i='1'; i <= '9'; i++) {
			     bos.write(i);
		     }
		     
		     //fos.close(); // <- ���� ũ�Ⱑ 5�ε�, FileOutputStream Ŭ������ close()�� ���ۿ� ���� ���� ������.
		     bos.close(); //�̸� ����� 6789���� �� �����
		} catch (IOException e) {
		     e.printStackTrace();		
		}
	}
}