package chapter07;

public class PackageTest {

	public static void main(String[] args) {
	
		System.out.println("Hello World!");
		PackageTest test = new PackageTest();
				
		System.out.println(test.getClass().getPackage());
	}

}
