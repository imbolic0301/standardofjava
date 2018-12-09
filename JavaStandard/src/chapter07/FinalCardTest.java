package chapter07;

public class FinalCardTest {

	public static void main(String[] args) {
		finalCard c = new finalCard("HEART" , 10);
		//c.NUMBER=5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c); // toString과 똑같음!
		
	}

}


class finalCard {
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	finalCard(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	finalCard(){
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
	
}