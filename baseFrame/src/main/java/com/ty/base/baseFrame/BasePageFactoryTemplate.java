package com.ty.base.baseFrame;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ty.base.selenium.tools.BaseUtils;

public class BasePageFactoryTemplate {

	BaseUtils bu = new BaseUtils();

	@Test
	public void testPageObject() {
		WebDriver driver = bu.initializeEventFiringWebDriverWithProfile();
		driver.get("http://blog.csdn.net/wanghantong");

		BasePageObjectTemplate object = PageFactory.initElements(driver,
				BasePageObjectTemplate.class);

		object.clickIndexView();

	}

	@Test
	public void testPageObjectModel() {

	}
}
