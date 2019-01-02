package chapter14;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx8 {
	public static void main(String[] args) {
		Student8[] stuArr = {
			new Student8("���ڹ�", true,  1, 1, 300),	
			new Student8("������", false, 1, 1, 250),	
			new Student8("���ڹ�", true,  1, 1, 200),	
			new Student8("������", false, 1, 2, 150),	
			new Student8("���ڹ�", true,  1, 2, 100),	
			new Student8("������", false, 1, 2,  50),	
			new Student8("Ȳ����", false, 1, 3, 100),	
			new Student8("������", false, 1, 3, 150),	
			new Student8("���ڹ�", true,  1, 3, 200),	

			new Student8("���ڹ�", true,  2, 1, 300),	
			new Student8("������", false, 2, 1, 250),	
			new Student8("���ڹ�", true,  2, 1, 200),	
			new Student8("������", false, 2, 2, 150),	
			new Student8("���ڹ�", true,  2, 2, 100),	
			new Student8("������", false, 2, 2,  50),	
			new Student8("Ȳ����", false, 2, 3, 100),	
			new Student8("������", false, 2, 3, 150),	
			new Student8("���ڹ�", true,  2, 3, 200)	
		};

		System.out.printf("1. �ܼ��׷�ȭ(�ݺ��� �׷�ȭ)%n");
		Map<Integer, List<Student8>> stuByBan = Stream.of(stuArr)
				                                     .collect(Collectors.groupingBy(Student8::getBan));
		
		for(List<Student8> ban : stuByBan.values()) {
			for(Student8 s : ban) {
				System.out.println(s);
			}
		}

		System.out.printf("%n2. �ܼ��׷�ȭ(�������� �׷�ȭ)%n");
		Map<Student8.Level, List<Student8>> stuByLevel = Stream.of(stuArr)
				.collect(Collectors.groupingBy(s-> {
						 if(s.getScore() >= 200) return Student8.Level.HIGH;
					else if(s.getScore() >= 100) return Student8.Level.MID;
					else                         return Student8.Level.LOW;
				}));

		TreeSet<Student8.Level> keySet = new TreeSet<>(stuByLevel.keySet());

		for(Student8.Level key : keySet) {
			System.out.println("["+key+"]");

			for(Student8 s : stuByLevel.get(key))
				System.out.println(s);
			System.out.println();
		}

		System.out.printf("%n3. �ܼ��׷�ȭ + ���(������ �л���)%n");
		Map<Student8.Level, Long> stuCntByLevel = Stream.of(stuArr)
				.collect(Collectors.groupingBy(s-> {
						 if(s.getScore() >= 200) return Student8.Level.HIGH;
					else if(s.getScore() >= 100) return Student8.Level.MID;
					else                         return Student8.Level.LOW;
				}, Collectors.counting()));

		for(Student8.Level key : stuCntByLevel.keySet())
			System.out.printf("[%s] - %d��, ", key, stuCntByLevel.get(key));
		System.out.println();
/*
		for(List<Student8> level : stuByLevel.values()) {
			System.out.println();
			for(Student8 s : level) {
				System.out.println(s);
			}
		}
*/
		System.out.printf("%n4. ���߱׷�ȭ(�г⺰, �ݺ�)%n");
		Map<Integer, Map<Integer, List<Student8>>> stuByHakAndBan =
          Stream.of(stuArr)
				.collect(Collectors.groupingBy(Student8::getHak,
						Collectors.groupingBy(Student8::getBan)
				));

		for(Map<Integer, List<Student8>> hak : stuByHakAndBan.values()) {
			for(List<Student8> ban : hak.values()) {
				System.out.println();
				for(Student8 s : ban)
					System.out.println(s);
			}
		}

		System.out.printf("%n5. ���߱׷�ȭ + ���(�г⺰, �ݺ� 1��)%n");
		Map<Integer, Map<Integer, Student8>> topStuByHakAndBan = Stream.of(stuArr)
				.collect(Collectors.groupingBy(Student8::getHak,
						Collectors.groupingBy(Student8::getBan,
								 Collectors.collectingAndThen(
									Collectors.maxBy(Comparator.comparingInt(Student8::getScore)),
								Optional::get
							)
						)
				));

		for(Map<Integer, Student8> ban : topStuByHakAndBan.values())
			for(Student8 s : ban.values())
				System.out.println(s);

		System.out.printf("%n6. ���߱׷�ȭ + ���(�г⺰, �ݺ� �����׷�)%n");
		Map<String, Set<Student8.Level>> stuByScoreGroup = Stream.of(stuArr)
			.collect(Collectors.groupingBy(s-> s.getHak() + "-" + s.getBan(),
					Collectors.mapping(s-> {
						 if(s.getScore() >= 200) return Student8.Level.HIGH;
					else if(s.getScore() >= 100) return Student8.Level.MID;
						 else                    return Student8.Level.LOW;
					} , Collectors.toSet())
			));

		 Set<String> keySet2 = stuByScoreGroup.keySet();

		for(String key : keySet2) {
			System.out.println("["+key+"]" + stuByScoreGroup.get(key));
		}
	}  
}


class Student8 {
	String name;
	boolean isMale; 
	int hak;		
	int ban;		
	int score;

	Student8(String name, boolean isMale, int hak, int ban, int score) { 
		this.name	= name;
		this.isMale	= isMale;
		this.hak	= hak;
		this.ban	= ban;
		this.score  = score;
	}

	String	getName()  { return name;}
	boolean isMale()   { return isMale;}
	int		getHak()   { return hak;}
	int		getBan()   { return ban;}
	int		getScore() { return score;}

	public String toString() { 
		return String.format("[%s, %s, %d�г� %d��, %3d��]", name, isMale ? "��":"��", hak, ban, score); 
	}

	enum Level {
		HIGH, MID, LOW
	}
}

