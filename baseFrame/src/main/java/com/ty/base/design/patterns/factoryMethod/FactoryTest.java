package com.ty.base.design.patterns.factoryMethod;

import org.junit.Test;

public class FactoryTest {
	@Test
	public void testFactory() {
		ProductCreater productCreater = new ProductCreater();
		ProductA productA = productCreater.createProduct(ProductA.class);
		productA.doSomething();
	}
}
