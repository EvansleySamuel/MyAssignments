package org.bank;

public class AxisBank extends BankInfo {

	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.deposit();

	}

	@Override
	public void deposit() {
		System.out.println("Deposit from Axis Bank");

	}
}
