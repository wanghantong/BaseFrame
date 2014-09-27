package com.ty.base.design.patterns.abstractfactory;

public class MercedesCreater extends MercedesFactory {

	@Override
	public <T extends Mercedes> T createMercedes(Class<T> clazz) {
		Mercedes newInstance = null;
			try {
				newInstance = (Mercedes) Class.forName(clazz.getName()).newInstance();
			} catch (InstantiationException | IllegalAccessException
					| ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return (T) newInstance;
	}


}
