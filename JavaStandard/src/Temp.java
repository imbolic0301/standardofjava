
public class Temp {
	public static void main(String[] args) {
		Integer t = 0;
		for (int i = 0; i < 16; i++) {
			System.out.print(String.format("\"" +"%04d",(Integer.parseInt(Integer.toBinaryString(i)))) + "\",");
		}
	}

	
}
