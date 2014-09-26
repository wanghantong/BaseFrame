package com.ty.base.design.patterns.factoryMethod;

public interface IManagerCreater {
	
	public <T extends TeamManager> T createManager(Class<T> clazz);
	
}
