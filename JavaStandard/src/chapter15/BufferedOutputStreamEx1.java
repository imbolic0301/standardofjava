package chapter15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx1 {
	public static void main(String args[]) {
		try {
		     FileOutputStream fos = new FileOutputStream("C:\\Users\\ChoiHongjun\\git\\standardofjava"
		    		 + "\\JavaStandard\\src\\chapter15\\123.txt");
		     // BufferedOutputStream의 버퍼 크기 5
		     BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
		     // 파일 123.txt에 1~9 출력
		     for(int i='1'; i <= '9'; i++) {
			     bos.write(i);
		     }
		     
		     //fos.close(); // <- 버퍼 크기가 5인데, FileOutputStream 클래스의 close()는 버퍼에 남은 값을 버린다.
		     bos.close(); //이를 실행시 6789까지 다 저장됨
		} catch (IOException e) {
		     e.printStackTrace();		
		}
	}
}