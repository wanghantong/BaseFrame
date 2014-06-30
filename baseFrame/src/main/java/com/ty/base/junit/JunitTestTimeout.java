package com.ty.base.junit;

import org.junit.Test;

public class JunitTestTimeout {

	@Test(timeout=2000)
	public void testTimeout() throws InterruptedException {
		Thread.sleep(2000);
	}
}
