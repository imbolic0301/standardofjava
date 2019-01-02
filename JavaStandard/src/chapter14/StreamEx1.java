package chapter14;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx1 {
	public static void main(String[] args) {
		
	     Stream<Student3> studentStream = Stream.of(
							new Student3("이자바", 3, 300),
							new Student3("김자바", 1, 200),
							new Student3("안자바", 2, 100),
							new Student3("박자바", 2, 150),
							new Student3("소자바", 1, 200),
							new Student3("나자바", 3, 290),
							new Student3("감자바", 3, 180)
						);

	     studentStream.sorted(Comparator.comparing(Student3::getBan) //반별 
			    	  .thenComparing(Comparator.naturalOrder()))    //기본 정렬 ->Student.compareTo를 따름
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
		return this.totalScore - s.totalScore   ; //오름차순으로 변경
		//return s.totalScore - this.totalScore; //내림차순.
		//반별로 정리가 된 element를 받아 compareTo를 실행, 실행시킨 변수의 입장에서 비교한 후 양수가 나오면 뒤로 감
		
	}
}
