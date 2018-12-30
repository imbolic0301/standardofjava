
public class Temp {
	public static void main(String[] args) {
		Test test = new Test();
		Thread thr = new Thread(test);
		System.out.println(thr.currentThread().getName());
		
		
	}

	
}


class Test implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}