package com.ty.base.design.patterns.abstractfactory;

public class Volkswagen_Passat extends Volkswagen {

	@Override
	public void getName() {
		System.err.println("I am Volkswagen_Passat.");
	}

	@Override
	public void getPrice() {
		System.out.println("Volkswagen_Passat is 300 thousands.");
	}

}
