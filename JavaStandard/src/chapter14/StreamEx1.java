package chapter14;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx1 {
	public static void main(String[] args) {
		
	     Stream<Student3> studentStream = Stream.of(
							new Student3("���ڹ�", 3, 300),
							new Student3("���ڹ�", 1, 200),
							new Student3("���ڹ�", 2, 100),
							new Student3("���ڹ�", 2, 150),
							new Student3("���ڹ�", 1, 200),
							new Student3("���ڹ�", 3, 290),
							new Student3("���ڹ�", 3, 180)
						);

	     studentStream.sorted(Comparator.comparing(Student3::getBan) //�ݺ� 
			    	  .thenComparing(Comparator.naturalOrder()))    //�⺻ ���� ->Student.compareTo�� ����
					  .forEach(System.out::println);
	}
}

class Student implements Comparable<Student3> {
	String name;
	int ban;
	int totalScore;

	Student(String name, int ban, int totalScore) { 
		this.name =name;
		this.ban =ban;
		this.totalScore =totalScore;
	}

	public String toString() { 
	    return String.format("[%s, %d, %d]", name, ban, totalScore).toString(); 
	}

	String getName()     { return name;}
	int getBan()         { return ban;}
	int getTotalScore()  { return totalScore;}

	@Override
	public int compareTo(Student3 s) { 
		System.out.println("s : " + s.totalScore + ", this : " + this.totalScore);
		return this.totalScore - s.totalScore   ; //������������ ����
		//return s.totalScore - this.totalScore; //��������.
		//�ݺ��� ������ �� element�� �޾� compareTo�� ����, �����Ų ������ ���忡�� ���� �� ����� ������ �ڷ� ��
		
	}
}
