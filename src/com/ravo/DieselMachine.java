package com.ravo;

public abstract class DieselMachine {
	
	public DieselMachine() {
		System.out.println("Constructor from DieselMachine i.e Abstract class");
	}
	
	public void start() {
		System.out.println("Machine starting...");
	}
	
	public abstract void fillFuel();

}
