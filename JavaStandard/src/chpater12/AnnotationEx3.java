package chpater12;

import java.util.ArrayList;

public class AnnotationEx3 {
	@SuppressWarnings("deprecation")     // deprecation���� ��� ����
	public static void main(String args[]) {
		NewClass2 nc = new NewClass2();

		nc.oldField = 10;                     //@Depreacted�� ���� ����� ���
		System.out.println(nc.getOldField()); //@Depreacted�� ���� ����� ���

		@SuppressWarnings("unchecked")               // ���׸��� ���� ��� ����
		ArrayList<NewClass2> list = new ArrayList();  // Ÿ���� �������� ����.
		list.add(nc);
	}
}

class NewClass2{
	int newField;

	int getNewField() { 
		return newField;
	}	

	@Deprecated
	int oldField;

	@Deprecated
	int getOldField() { 
		return oldField;
	}
}