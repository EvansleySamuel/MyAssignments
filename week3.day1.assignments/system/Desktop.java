package org.system;

public class Desktop extends Computer {

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.computerModel();
		d.desktopSize();

	}

	public void desktopSize() {
		System.out.println("Desktop Size: 15.5");
	}
}
