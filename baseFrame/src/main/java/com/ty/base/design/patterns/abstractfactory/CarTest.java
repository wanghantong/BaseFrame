package com.ty.base.design.patterns.abstractfactory;

import org.junit.Test;

public class CarTest {

	@Test
	public void createMercedes_GLK() {
		MercedesCreater creater = new MercedesCreater();
		Mercedes_GLK mercedes_GLK = creater.createMercedes(Mercedes_GLK.class);
	}

	@Test
	public void createMercedes_S600() {
		MercedesCreater creater = new MercedesCreater();
		Mercedes_S600 mercedes_S600 = creater.createMercedes(Mercedes_S600.class);
	}
	@Test
	public void createVolkswagen_Passat() {
		VolkswagenCreater creater = new VolkswagenCreater();
		Volkswagen_Passat volkswagen_Passat = creater.createVolkswage(Volkswagen_Passat.class);
	}
}
