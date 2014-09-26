package com.ty.base.baseFrame;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BaseTestNG {

	 @Test(dataProvider = "dp")
	  public void f(Integer n, String s) {
	  }
	  @BeforeMethod
	  public void beforeMethod() {
	  }

	  @AfterMethod
	  public void afterMethod() {
	  }


	  @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { 1, "a" },
	      new Object[] { 2, "b" },
	    };
	  }
	  @BeforeClass
	  public void beforeClass() {
	  }

	  @AfterClass
	  public void afterClass() {
	  }

	  @BeforeTest
	  public void beforeTest() {
	  }

	  @AfterTest
	  public void afterTest() {
	  }
}
