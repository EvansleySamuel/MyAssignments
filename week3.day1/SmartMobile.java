package week3.day1;

public class SmartMobile extends AndroidMobile {
	public static void main(String[] args) {
		AndroidMobile a = new AndroidMobile();
		a.takeVideo();
	}

	@Override
	public void takeVideo() {
		System.out.println("Started to shoot video from Smart Mobile");
		super.takeVideo();
	}

	
}
