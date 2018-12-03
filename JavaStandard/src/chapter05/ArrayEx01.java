package chapter05;

public class ArrayEx01 {

	public static void main(String[] args) {
		int[] score = new int[5];
		int k = 1;
		
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;
		score[3] = 80;
		score[4] = 90;
		
		int tmp = score[k+2] + score [4] ; // int tmp = score[3] + score [4]
		
		for(int i=0; i <5; i++) {
			System.out.printf("score[%d] : %d%n", i, score[i]);
		}
		
		
		System.out.printf("tmp:%d%n",  tmp);

		System.out.printf("score[%d] : %d%n", 7, score[7]);
		//배열의 길이를 벗어난 값의 요소를 찾았기 때문에  ArrayIndexOutOfBoundsException 예외처리가 일어난다
	}

}
