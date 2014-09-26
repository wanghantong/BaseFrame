package com.ty.base.baseFrame;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ty.base.selenium.tools.BaseUtils;

public class BaseSeleniumFrame {
	@Test
	public void testFrame() {
		BaseUtils bu= new BaseUtils();
		WebDriver driver = bu.initializeEventFiringWebDriverWithProfile();
		driver.get("http://blog.csdn.net/wanghantong");
		WebElement article_list = bu.getElement(driver, By.id("article_list"));
		bu.sleepSeconds(3);
		
		WebElement ad_frm_0 = bu.getElement(driver, By.id("ad_frm_0"));
		
	}
}
