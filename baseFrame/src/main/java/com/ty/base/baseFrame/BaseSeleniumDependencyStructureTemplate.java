package com.ty.base.baseFrame;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.ty.base.selenium.tools.BaseUtils;

public class BaseSeleniumDependencyStructureTemplate {

	WebDriver driver;
	BaseUtils bu;

	@Test
	public void testMethod() {
		driver.get("http://blog.csdn.net/wanghantong");
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
		bu = new BaseUtils();
		driver = bu.initializeEventFiringWebDriverWithProfile();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {

	}
}
