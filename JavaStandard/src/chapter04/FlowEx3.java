package chapter04;

import java.util.Scanner;

public class FlowEx3 {

	public static void main(String[] args) {
		int input;

		System.out.print("숫자를 하나 입력하세요.>");

		Scanner sc = new Scanner(System.in);

		String tmp = sc.nextLine();
		input = Integer.parseInt(tmp);

		if (input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else { // input != 0인 경우가 됨
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d입니다.", input);
		}

	}

}
