package chapter06;

public class TvTest {

	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 "+t.channel + "번 입니다.");
		
	}

}
