package chapter02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("���ڸ� ������ �ϳ� �Է����ּ���.>");
		String input= sc.nextLine();
		int num = Integer.parseInt(input); //�Է¹��� ���� ���ڷ� ��ȯ
		
		System.out.println("�Է� ���� :" + input);
		System.out.printf("num=%d%n", num);
		
	}
}
