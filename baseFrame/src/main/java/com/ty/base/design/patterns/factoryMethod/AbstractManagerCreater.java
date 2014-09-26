package com.ty.base.design.patterns.factoryMethod;

public interface AbstractManagerCreater {
	
	public <T extends TeamManager> T createManager(Class<T> clazz);
	
}
