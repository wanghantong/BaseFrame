package com.ty.base.design.patterns.factoryMethod;

public class ManagerCreater implements AbstractManagerCreater {

	@Override
	public <T extends TeamManager> T createManager(Class<T> clazz) {
		TeamManager newInstance = null;
		try {
			newInstance = (TeamManager) Class.forName(
					clazz.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (T) newInstance;
	}

}
