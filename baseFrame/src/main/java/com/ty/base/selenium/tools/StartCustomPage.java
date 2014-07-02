/**

 * 创建时间：2014年4月30日 上午10:46:11

 * 项目名称：exam

 * @author T.Y

 * @version 1.0

 * @since JDK 1.7

 * 文件名称：StartPage.java

 * 类说明：

 */
package com.ty.base.selenium.tools;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartCustomPage {
	/**
	 * 
	 * Title: startQunar
	 * 
	 * <p>
	 * Description: start qunar : http://flight.qunar.com/
	 * </p>
	 * 
	 * @param BaseUtils
	 * @param driver
	 * @param url
	 *            : http://flight.qunar.com/
	 * 
	 */
	public static void startQunar(WebDriver driver) {
		String url = "http://flight.qunar.com/";

		driver.get(url);

		driver.manage().window().maximize();

	}

	public static void startNoney(BaseUtils BaseUtils, WebDriver driver) {
		String url = "http://wanghantong.phpnet.us/noney.html";
		driver.get(url);
		driver.manage().window().maximize();

	}

	public static void startNoney(WebDriver driver) {
		String url = "http://wanghantong.phpnet.us/noney.html";
		driver.get(url);
		driver.manage().window().maximize();

	}

	public static void startNoney(BaseWaitUtils wutils, WebDriver driver) {
		String url = "http://wanghantong.phpnet.us/noney.html";
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void startTest(BaseUtils BaseUtils, WebDriver driver, String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

}
