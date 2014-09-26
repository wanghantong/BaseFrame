package com.ty.base.design.patterns.factoryMethod;

public class ProductCreater extends AbstractProductCreater {

	@Override
	public <T extends Product> T createProduct(Class<T> clazz) {
		Product newInstance = null;
		try {
			newInstance = (Product) Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return (T) newInstance;
	}

}
