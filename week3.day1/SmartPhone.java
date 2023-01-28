package week3.day1;

public class SmartPhone extends AndroidPhone {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.sendMsg();
		sp.makecall();
		sp.savecontact();
		sp.takeVideo();
		sp.connectWhatsapp();
	}

	public void connectWhatsapp() {
		System.out.println("Whatsapp Connected in SmartPhone");
	}
}
