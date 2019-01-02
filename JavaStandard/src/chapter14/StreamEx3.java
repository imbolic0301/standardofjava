package chapter14;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {
	public static void main(String[] args) {
		Student3[] stuArr = { new Student3("이자바", 3, 300), new Student3("김자바", 1, 200), new Student3("안자바", 2, 100),
				new Student3("박자바", 2, 150), new Student3("소자바", 1, 200), new Student3("나자바", 3, 290),
				new Student3("감자바", 3, 180) };

		Stream<Student3> stuStream = Stream.of(stuArr);

		stuStream.sorted(Comparator.comparing(Student3::getBan)
				.thenComparing(Comparator.naturalOrder()))
				.forEach(System.out::println);

		stuStream = Stream.of(stuArr); // 스트림을 다시 생성하는 이유? 
		//stuStream은 위의 forEach를 거치면서 소모됐음.
		IntStream stuScoreStream = stuStream.mapToInt(Student3::getTotalScore);

		IntSummaryStatistics stat = stuScoreStream.summaryStatistics();
		System.out.println("count=" + stat.getCount());
		System.out.println("sum=" + stat.getSum());
		System.out.printf("average=%.2f%n", stat.getAverage());
		System.out.println("min=" + stat.getMin());
		System.out.println("max=" + stat.getMax());

	}
}

class Student3 implements Comparable<Student3> {
	String name;
	int ban;
	int totalScore;

	Student3(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}

	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
	}

	String getName() {
		return name;
	}

	int getBan() {
		return ban;
	}

	int getTotalScore() {
		return totalScore;
	}

	public int compareTo(Student3 s) {
		return s.totalScore - this.totalScore;
		//비교하는 주체가 파라미터로 넘겨진 객체와 비교해서 높을경우 앞으로...
		//==> 내림차순
	}
}
