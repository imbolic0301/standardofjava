package chapter13;

import javax.swing.JOptionPane;

public class ThreadEx6 {
	public static void main(String[] args) throws Exception
	{
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���."); 
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");

		for(int i=10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch(Exception e ) {}
		}
	}
}