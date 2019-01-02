package chapter14;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx2 {
	public static void main(String[] args) {
		File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"),
			new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")
		};

		Stream<File> fileStream = Stream.of(fileArr);

		// map()으로 <File> -> <String>으로 변환
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println); // 모든 파일의 이름을 출력

		fileStream = Stream.of(fileArr);  // 스트림을 다시 생성

		fileStream.map(File::getName)			 // Stream<File> → Stream<String>
			      .filter(s -> s.indexOf('.')!=-1)   // 확장자가 없는 것은 제외
			      //filter를 거쳐 "Ex1"이 제외됨
			      .map(s -> s.substring(s.indexOf('.')+1)) // 확장자만 추출
			      .map(String::toUpperCase)    //  대문자로 변환
			      .distinct()			       //  중복 제거
			      .forEach(System.out::println); // JAVA, BAK ,TXT
				

		System.out.println("filter 확인용");
	}
}
