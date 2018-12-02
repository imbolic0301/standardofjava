package chapter04;

import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {
		int user, com;

		System.out.print("가위(1), 바위(2), 보(3) 중 원하는 숫자를 입력하세요. > ");

		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		user = Integer.parseInt(tmp);
		
		com = (int) (Math.random() *3) +1; //1,2,3 중 하나가 입력됨
		System.out.printf("당신은  %d 입니다.%n" , user);
		System.out.printf("컴퓨터는  %d 입니다.%n" , com);
		
		switch(user-com) {
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
			break;
			
		}
	}

}
