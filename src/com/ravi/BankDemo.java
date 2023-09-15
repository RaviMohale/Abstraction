package com.ravi;

public class BankDemo {
	public static void main(String[] args) {
		
		Bank b; // reference variable
		Bank b1 = new HdfcBank();  //valid
		b = new  HdfcBank(); // storing impl obj into ref variable
		b.moneyTransfer(); // Hdfc bank method will be called
		b.checkBalance(); // Hdfc bank method will be called
		 
		
		Bank b2 = new AxisBank();  // valid
		b = new AxisBank();
		b.moneyTransfer(); // Axis bank method will be called
		b.checkBalance(); // Axis bank method will be called
	}

}
