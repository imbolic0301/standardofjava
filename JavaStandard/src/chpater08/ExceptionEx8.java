package chpater08;

public class ExceptionEx8 {	
	public static void main(String[] args) {
		try {
			Exception e = new Exception("���� �߻�");
			throw e;
		
		} catch (Exception e) {
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷� ���� ����");
	}

}
