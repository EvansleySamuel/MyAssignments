package org.abstraction;

public abstract class MultipleLanguage implements Language, TestTool {

	public void python() {
		System.out.println("I am python");
	}

	public abstract void ruby();
}
