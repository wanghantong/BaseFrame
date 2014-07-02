package com.ty.base.junit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.ty.base.selenium.tools.BaseUtils;

public class JunitBasePageTest {
	@Test
	public void testBasePage() {
		BaseUtils bu = new BaseUtils();
		EventFiringWebDriver driver = bu
				.initializeEventFiringWebDriverWithProfile();
		driver.get("http://blog.csdn.net/wanghantong");
		WebElement btnContents = bu.getWebElement(driver, By.id("btnContents"));
		WebElement contents = btnContents.findElement(By.tagName("span"));
		bu.clickElement(driver, contents);
		
		bu.sleepSeconds(3);
		
		WebElement btnView = bu.getWebElement(driver, By.id("btnView"));
		WebElement view = btnView.findElement(By.tagName("span"));
		bu.clickElement(driver, view);
		bu.sleepSeconds(4);
		driver.quit();

	}
}
