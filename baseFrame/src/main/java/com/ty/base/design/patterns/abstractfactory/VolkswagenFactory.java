package com.ty.base.design.patterns.abstractfactory;

public abstract class VolkswagenFactory {

	public abstract Volkswagen createVolkswagen_Passat();
	public abstract <T extends Volkswagen> T createVolkswage(Class<T> clazz);

}
