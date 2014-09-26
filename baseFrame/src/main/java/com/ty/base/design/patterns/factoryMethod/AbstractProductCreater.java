package com.ty.base.design.patterns.factoryMethod;

public abstract class AbstractProductCreater {
	public abstract <T extends Product> T createProduct(Class<T> clazz);
}
