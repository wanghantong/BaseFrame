package com.ty.base.design.patterns.abstractfactory;

public class VolkswagenCreater extends VolkswagenFactory {

	@Override
	public Volkswagen createVolkswagen_Passat() {
		return new Volkswagen_Passat();
	}

	@Override
	public <T extends Volkswagen> T createVolkswage(Class<T> clazz) {
		Volkswagen newInstance = null;
		try {
			newInstance = (Volkswagen) Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (T) newInstance;
	}

}
