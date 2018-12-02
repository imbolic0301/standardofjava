package chpater03;

public class OperatorEx2 {

	public static void main(String[] args) {
		int i=5, j=0;
		j = i++;
		System.out.println("j=i++; 실행 후 i=" + i +", j= " + j);
		i=5;
		j=0;
		j= ++i;
		System.out.println("j=++i; 실행 후, i=" +i+ ", j= " + j);
		
		//결론 : 값이 '참조'되기 전이냐 된 후냐의 차이
	}

}
