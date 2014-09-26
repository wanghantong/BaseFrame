/**

 * create time : Mar 7, 2014 4:44:49 PM

 * project name : TYTestLib

 * @author T.Y

 * @version 1.0

 * @since JDK 1.7

 * file name : Test.java

 */
package com.ty.base.selenium.tools;

import java.io.IOException;
import java.sql.Time;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBaseUtils extends BaseUtils {
	BaseUtils bu = new BaseUtils();

	// @Deprecated
	// @Test
	public void testInitializeFirefoxDriver() {
		FirefoxDriver driver = bu.initializeFirefoxDriver();
		driver.get("http://blog.csdn.net/wanghantong/article/details/28897695");
		bu.setWindowMaxSize(driver);
		bu.sleepSeconds(3);
		driver.quit();
	}
	
	@Test
	public void testInitializeFirefoxDriverWithFirefoxProfile() {
		FirefoxDriver driver = bu.initializeFirefoxDriverWithFirefoxProfile();
		driver.get("http://blog.csdn.net/wanghantong");
		bu.setWindowMaxSize(driver);
		bu.sleepSeconds(3);
		driver.quit();
	}
	
	static final WebDriver driver = new FirefoxDriver();
	

	public void testGetWebElement(String id) {
		// id=j_allsort
		WebElement webElement = getElement(driver, By.id(id));
		System.err.println("webElement   = " + webElement);
	}

	public void testIsElementPresent(String exist, String nPresent) {
		// "allCategoryHeader", "noney"
		boolean e = isElementPresent(driver, By.id(exist));
		boolean np = isElementPresent(driver, By.id(nPresent));
		System.err.println(e + "  ,  " + np);
	}

	public void testIsElementPresentAndDisplay(String id) {
		// j_allsort -- youFavorateProduct_prod
		WebElement webElement = getElement(driver, By.id(id));
		System.err.println(webElement);
		boolean b = isElementDisplay(webElement);
		System.err.println(b);
	}

	public void testHighLight(String id) {
		WebElement webElement = getElement(driver, By.id(id));
		highLight(driver, webElement);
	}

	public void testHighLightExt(String id, WebDriver driver) {
		WebElement webElement = getElement(driver, By.id(id));
		highLightExt(driver, webElement);
	}

	public void testExecuteJS(String script) {
		script = "alert(arguments[0])";
		executeJS(driver, script);
	}

	public void testExecuteJS(String script, WebElement webElement) {
		script = "alert(arguments[0])";
		webElement = getElement(driver, By.id("setf"));
		executeJS(driver, script, webElement);
	}

	public void testClickElement(String id) {
		WebElement webElement = getElement(driver, By.id(id));
		clickElement(driver, webElement);
	}

	public void testClickElementViaJs(String id) {
		WebElement webElement = getElement(driver, By.id(id));
		clickElementViaJs(driver, webElement);
	}

	public void testClickElementViaJsID(String id) {
		clickElementViaJsID(driver, id);
	}

	public void testClickElementViaMouse(String id) {
		WebElement webElement = getElement(driver, By.id(id));
		clickElementViaMouse(driver, webElement);
	}

	public void testRightClickElement(String id) {
		WebElement webElement = getElement(driver, By.id(id));
		clickElement_rightClick(driver, webElement);
	}

	/*
	 * testSelectElementViaText testSelectElementViaValue on testing
	 * http://tw.money.yahoo.com/ the results is same,it should be checked by
	 * detail test
	 */
	public void testSelectElementViaText(String id, String text) {
		WebElement webElement = getElement(driver, By.name(id));
		selectElementViaText(driver, webElement, text);
	}

	public void testSelectElementViaValue(String id, String value) {
		WebElement webElement = getElement(driver, By.name(id));
		selectElementViaText(driver, webElement, value);
	}

	public void testSelectElementViaIndex(String id, int index) {
		WebElement webElement = getElement(driver, By.name(id));
		selectElementViaIndex(driver, webElement, index);
	}

	public void testFindElementListByTagName() {
		WebElement webElement = getElement(driver, By.name("from"));
		List<WebElement> list = findElementListByTagName(driver, webElement,
				"option");
		for (WebElement element : list) {
			System.err.println(element.getTagName());
		}

	}

	public void testFindElementByCSS(String css) {
		WebElement webElement = getElement(driver, By.id("yfiuhl"));
		WebElement element = findElementByCSS(driver, webElement, css);
		WebElement element2 = getElement(driver, By.cssSelector(css));
		String attribute = webElement.getAttribute("style");
		System.err.println("attribute   " + attribute);
		System.err.println(element.getText());

	}

	public void testSendKeys() {
		WebElement webElement = getElement(driver, By.name("amt"));
		sendKeys(driver, webElement, "11111");
	}

	public void testGetCurrentPageURL() {
		getCurrentPageURL(driver);
	}

	public void testWaitForBrowserFullSync() {
		boolean b = waitForBrowserFullSync(driver);
		System.err.println(b);
	}

	/*
	 * need to test again, missed
	 */
	public void testWaitForObjectDisplay() {
		testWaitForBrowserFullSync();
		boolean b = waitForObjectDisplay(driver, "/select/option");
		System.err.println(b);
	}

	public void testWaitProcessBarNotAppear() {
		WebElement webElement = getElement(driver, By.linkText("���ؔ���s�I"));
		boolean b = waitProcessBarNotAppear(driver, webElement);
		System.err.println(b);
	}

	public void testGetPageLoadTime() {
		long time = getPageLoadTime(driver);
		System.err.println(time);
	}

	public void testScrollToView() {
		WebElement webElement = getElement(driver, By.id("yfihplo"));
		scrollToView(driver, webElement);
	}

	public void testRefreshPage() {
		refreshPage(driver);
	}

	public void testSleepSeconds() {
		sleepSeconds(10);
	}

	public void testGetPageTitle() {
		String pageTitle = getPageTitle(driver);
		System.err.println("pageTitle  :" + pageTitle);
	}
//	@test
	public void testScreenShort() {
		try {
			WebElement webElement = getElement(driver, By.id("yfifpf"));
			scrollToView(driver, webElement);
			screenShort(driver, "E:/screenShort/ss.png");
		} catch (IOException e) {
			logger.error("screenShort has got an problem " + e.getMessage()
					+ " ; current time : "
					+ new Time(System.currentTimeMillis()));
		}
	}

	/*
	 * need to test again, missed
	 */
	public void testWaitForGUIAppear() {
		WebElement webElement = getElement(driver, By.name("ie"));
		boolean b = waitForGUIAppear(driver, webElement, 100);
		System.err.println(b);
	}

	// ------------------

	public void test() {
		WebElement webElement2 = getElement(driver, By.id("content"));
		boolean displayed = webElement2.isDisplayed();
		System.err.println("displayed   " + displayed);
	}

	// ------------------

	public static void main(String[] args) {
		driver.get("http://www.baidu.com/");
		/**
		 * www.yhd.com
		 */
		// t.testGetWebElement("j_allsort");
		// t.testIsElementPresent("allCategoryHeader", "noney");
		// t.testIsElementPresentAndDisplay("j_allsort");
		// t.testIsElementPresentAndDisplay("youFavorateProduct_prod");
		/**
		 * www.jd.com
		 */
		// t.testHighLight("_JD_ALLSORT");
		/**
		 * www.baidu.com
		 */
		// t.testHighLightExt("setf", driver);
		// t.testExecuteJS(null);
		// t.testExecuteJS(null, null);
		// t.testClickElement("setf");
		// t.testClickElementViaJs("setf");
		// t.testClickElementViaJsID("setf");
		// t.testClickElementViaMouse("setf");
		/*
		 * http://tw.money.yahoo.com/
		 */
		// t.testSelectElementViaText("from", "�ێ�(HKD)");
		// t.testSelectElementViaValue("from", "��Ԫ(USD)");
		// t.testSelectElementViaIndex("from", 4);
		// t.testFindElementListByTagName();
		/*
		 * ���Ͻǽ���ͷ��
		 */
		// t.testFindElementByCSS(".bd");
		// t.testGetCurrentPageURL();
		// t.testSendKeys();
		// t.testWaitForBrowserFullSync();
		// t.testWaitForObjectDisplay();
		// t.testWaitProcessBarNotAppear();
		// t.testGetPageLoadTime();
		// t.testScrollToView();
		// t.testRefreshPage();
		// t.testGetPageTitle();
		// t.testScreenShort();
		/*
		 * www.baidu.com
		 */
		// BaseUtils.testWaitForGUIAppear(driver);
		// t.test();
		// driver.quit();
	}

}
