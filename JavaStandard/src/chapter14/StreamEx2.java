package chapter14;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx2 {
	public static void main(String[] args) {
		File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"),
			new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")
		};

		Stream<File> fileStream = Stream.of(fileArr);

		// map()���� <File> -> <String>���� ��ȯ
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println); // ��� ������ �̸��� ���

		fileStream = Stream.of(fileArr);  // ��Ʈ���� �ٽ� ����

		fileStream.map(File::getName)			 // Stream<File> �� Stream<String>
			      .filter(s -> s.indexOf('.')!=-1)   // Ȯ���ڰ� ���� ���� ����
			      //filter�� ���� "Ex1"�� ���ܵ�
			      .map(s -> s.substring(s.indexOf('.')+1)) // Ȯ���ڸ� ����
			      .map(String::toUpperCase)    //  �빮�ڷ� ��ȯ
			      .distinct()			       //  �ߺ� ����
			      .forEach(System.out::println); // JAVA, BAK ,TXT
				

		System.out.println("filter Ȯ�ο�");
	}
}
