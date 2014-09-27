package com.ty.base.design.patterns.abstractfactory;

public abstract class Mercedes implements Car {

	@Override
	public void run() {
		System.err.println("Mercedes can run.");
	}
	
}
