package chapter07.inventory;

public class TVCR extends Tv{
	VCR vcr = new VCR(); 
	int counter = vcr.counter; 
	
	public void play() {
		vcr.play();
	}
	
	public void stop() {
		vcr.stop();
	}
	public void rew() {
		vcr.rew();
	}
	
	public void ff() {
		vcr.ff();
	}
}
