package week3.day1;

public class Samsung  extends AndroidTV{

	public static void main(String[] args) {
		Samsung s = new Samsung();
		s.openApp();
		s.playVideo();
		
	}
	public void playVideo() {
		
		System.out.println("Video is playing..from Samsung");
		
	}

	
}
