package com.ty.base.junit;

import java.io.IOException;

import org.junit.Test;

public class JunitTestExceptions {

	@Test(expected=IOException.class)
	public void testExceptions() throws InterruptedException {

		throw new RuntimeException();
	}
	
	
	@Test(expected=RuntimeException.class)
	public void testExceptions2() throws InterruptedException {
		
		throw new RuntimeException();
	}
	
	
}
