package com.ty.base.design.patterns.abstractfactory;


public abstract class MercedesFactory {

	public abstract <T extends Mercedes> T createMercedes(Class<T> clazz);

}
