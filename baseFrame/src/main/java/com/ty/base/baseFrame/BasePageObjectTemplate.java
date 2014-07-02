package com.ty.base.baseFrame;

import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.ty.base.selenium.tools.BaseUtils;


public class BasePageObjectTemplate {
	
	@FindBy(id="btnContents")
	private WebElement indexView;

	private WebElement searchTypeSng;
	@FindBy(name = "fromCity")
	private WebElement fromCity;
	@FindBy(name = "toCity")
	private WebElement toWhere;

	private WebElement fromDate;
	@FindBy(xpath = "")
	private WebElement end;

	BaseUtils bu = new BaseUtils();
	
	public void clickIndexView() {
		
		BaseUtils bu = new BaseUtils();
		EventFiringWebDriver driver = bu.initializeEventFiringWebDriverWithProfile();
		System.out.println(indexView.getText());
		bu.highLight(driver, indexView);
		indexView.click();
	}
	
	public String calDate(int nextDays) {
		// 当前日期加 n 天之后 n=30
		Date date = DateUtils.addDays(new Date(), nextDays);
		// 格式化时间格式
		return DateFormatUtils.ISO_DATE_FORMAT.format(date);
	}
	
	
	
	public void searchTrip(WebDriver driver, String from, String to, String date) {
		bu.clearAndTypeString(driver, fromCity, from);
		bu.clearAndTypeString(driver, toWhere, to);
		bu.clearAndTypeString(driver, fromDate, date);
		searchTypeSng.submit();
	}
}
