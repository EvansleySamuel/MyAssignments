package org.abstraction;

public class Automation extends MultipleLanguage {

	@Override
	public void ruby() {
		System.out.println("I am Ruby");

	}

	public void java() {
		System.out.println("I am Java");

	}

	public void selenium() {
		System.out.println("I am Selenium");

	}

	public static void main(String[] args) {
		Automation a = new Automation();
		a.ruby();
		a.java();
		a.selenium();
		a.python();
	}

}
