package com.ty.base.design.patterns.single;

public class Singleton {

	private static final Singleton singleton = new Singleton();

	private Singleton() {
	}

	public static Singleton getSingleInstance() {
		return singleton;
	}

}
