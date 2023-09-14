package com.ravo;

public class Machine extends DieselMachine {
	
	public Machine() {
		System.out.println("Contructor from Machine class");
	}

	@Override
	public void fillFuel() {
		System.out.println("filling fuel tank");
		
	}
	public static void main(String[] args) {
		Machine m = new Machine();
		m.fillFuel();
		m.start();
	}

}
