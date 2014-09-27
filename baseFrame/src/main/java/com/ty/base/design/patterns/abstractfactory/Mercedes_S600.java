package com.ty.base.design.patterns.abstractfactory;

public class Mercedes_S600 extends Mercedes {

	@Override
	public void getName() {
		System.out.println("I am Mercedes_S600.");
	}

	@Override
	public void getPrice() {
		System.err.println("Mercedes_S600 is 6 million.");
	}

}
