package com.ty.base.baseFrame;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ty.base.selenium.tools.BaseUtils;

public class BaseSeleniumCookie {

	@Test
	public void testFrame() {
		BaseUtils bu= new BaseUtils();
		WebDriver driver = bu.initializeEventFiringWebDriverWithProfile();
		driver.get("http://blog.csdn.net/wanghantong");
		WebElement element = bu.getElement(driver, By.id("ad_frm_0"));
	}
}
