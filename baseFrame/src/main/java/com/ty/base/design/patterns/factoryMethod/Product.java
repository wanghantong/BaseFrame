package com.ty.base.design.patterns.factoryMethod;

public abstract class Product {
	
	public void beSold() {
		System.out.println("I was used to sell.");
	}
	
	public abstract void doSomething();
	
}
