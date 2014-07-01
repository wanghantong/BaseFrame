/**

 * ����ʱ�䣺Apr 16, 2014 3:22:07 PM

 * ��Ŀ���ƣ�TYTestLib

 * @author T.Y

 * @version 1.0

 * @since JDK 1.7

 * �ļ����ƣ�MyWebDriverListener.java

 * ��˵����

 */
package com.ty.base.selenium.tools;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class MyWebDriverListener implements WebDriverEventListener {

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("beforeNavigateTo�����������url : " + url);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("��ת֮ǰ��ҳ��urlΪ��" + currentUrl);
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("��ת֮���ҳ��urlΪ��" + currentUrl);
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {

	}

	@Override
	public void afterNavigateBack(WebDriver driver) {

	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {

	}

	@Override
	public void afterNavigateForward(WebDriver driver) {

	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("listener   beforeFindBy  ");
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println(" listener afterFindby");
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println(" listener beforeClickOn");
		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println(" listener afterClickOn");

	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver) {

	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver) {

	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		System.out.println(" listener beforeScript");

	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		System.out.println(" listener afterScript");

	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		try {
			new BaseUtils().screenShort(driver, "");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				"yyyy-mm-dd hh-mm-ss");
		String dateString = simpleDateFormat.format(date);
		try {
			// ��ȡ��ǰ��ͼ
			File scrFile = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);
			// ����ͼƬ�ļ�
			File screenShot = new File("E:/" + dateString + ".png");
			// �����ļ�
			FileUtils.copyFile(scrFile, screenShot);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("�����쳣 : " + throwable.getMessage());
		System.out.println("��ͼ�ѱ�������E:/" + dateString + ".png");
	}

}
