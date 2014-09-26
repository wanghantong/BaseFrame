///**
//
// * 创建时间：May 5, 2014 3:28:54 PM
//
// * 项目名称：exam
//
// * @author T.Y
//
// * @version 1.0
//
// * @since JDK 1.7
//
// * 文件名称：TestBaseWaitUtils.java
//
// * 类说明：
//
// */
//package com.ty.base.selenium.tools;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class TestBaseWaitUtils {
//
//	protected WebDriver driver;
//
//	public TestBaseWaitUtils() {
//		// driver = new FirefoxDriver();
//	}
//
//	@Test
//	public void testTextToBePresentInElement() {
//		StartCustomPage.startNoney(driver);
//		WebElement element = driver.findElement(By.id("firstBox"));
//		String text = "second-box";
//		String textNotPresent = "second-boxxxxx";
//		Boolean isPresent5 = BaseWaitUtils.textToBePresentInElement(driver, 5,
//				element, text);
//		Boolean isPresent5_NotPresent = BaseWaitUtils.textToBePresentInElement(
//				driver, 5, element, textNotPresent);
//		Boolean isPresent15 = BaseWaitUtils.textToBePresentInElement(driver,
//				15, element, text);
//		Boolean isPresent15_NotPresent = BaseWaitUtils
//				.textToBePresentInElement(driver, 15, element, textNotPresent);
//		Assert.assertFalse(isPresent5,
//				"now it should be not present on the page,you'd better wait 5 seconds");
//		Assert.assertTrue(isPresent15, "now it should be present on the page");
//		Assert.assertFalse(isPresent5_NotPresent, "there is no text '"
//				+ textNotPresent + "' on the page");
//		Assert.assertFalse(isPresent15_NotPresent, "there is no text '"
//				+ textNotPresent + "' on the page");
//	}
//
//	/**
//	 * 
//	 * Title: testTextToBePresentInElementLocated
//	 * 
//	 * <p>
//	 * Description: according to view text to find the sub element of -By-
//	 * </p>
//	 * 
//	 * return param type : boolean
//	 */
//	@Test
//	public void testTextToBePresentInElementLocated() {
//		StartCustomPage.startNoney(driver);
//		String text = "second-box";
//		String textNotPresent = "second-boxxxxx";
//		By by = By.id("firstBox");
//		Boolean isPresent5 = BaseWaitUtils.textToBePresentInElementLocated(
//				driver, 5, by, text);
//		Boolean isPresent5_NotPresent = BaseWaitUtils
//				.textToBePresentInElementLocated(driver, 5, by, textNotPresent);
//		Boolean isPresent15 = BaseWaitUtils.textToBePresentInElementLocated(
//				driver, 15, by, text);
//		Boolean isPresent15_NotPresent = BaseWaitUtils
//				.textToBePresentInElementLocated(driver, 15, by, textNotPresent);
//		Assert.assertFalse(isPresent5,
//				"now it should be not present on the page,you'd better wait 5 seconds");
//		Assert.assertTrue(isPresent15, "now it should be present on the page");
//		Assert.assertFalse(isPresent5_NotPresent, "there is no text '"
//				+ textNotPresent + "' on the page");
//		Assert.assertFalse(isPresent15_NotPresent, "there is no text '"
//				+ textNotPresent + "' on the page");
//
//	}
//
//	/**
//	 * 
//	 * Title: testPresenceOfElementLocated
//	 * 
//	 * <p>
//	 * Description: find an element through -By-
//	 * </p>
//	 * 
//	 */
//	@Test
//	public void testPresenceOfElementLocated() {
//		StartCustomPage.startNoney(driver);
//
//		String text = "second-box";
//		String textNotPresent = "second-boxxxxx";
//
//		By by = By.id("firstBox");
//		Boolean isPresent5 = BaseWaitUtils.textToBePresentInElementLocated(
//				driver, 5, by, text);
//		Boolean isPresent5_NotPresent = BaseWaitUtils
//				.textToBePresentInElementLocated(driver, 5, by, textNotPresent);
//		Boolean isPresent15 = BaseWaitUtils.textToBePresentInElementLocated(
//				driver, 15, by, text);
//		Boolean isPresent15_NotPresent = BaseWaitUtils
//				.textToBePresentInElementLocated(driver, 15, by, textNotPresent);
//		Assert.assertFalse(isPresent5,
//				"now it should be not present on the page,you'd better wait 5 seconds");
//		Assert.assertTrue(isPresent15, "now it should be present on the page");
//		Assert.assertFalse(isPresent5_NotPresent, "there is no text '"
//				+ textNotPresent + "' on the page");
//		Assert.assertFalse(isPresent15_NotPresent, "there is no text '"
//				+ textNotPresent + "' on the page");
//
//	}
//
//	/**
//	 * 
//	 * Title: testElementToBeClickableBy
//	 * 
//	 * <p>
//	 * Description: if the button is to be clickable, return the element else
//	 * throw an exception
//	 * </p>
//	 */
//	@Test
//	public void testElementToBeClickableBy() {
//		StartCustomPage.startNoney(driver);
//
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//
//		WebElement element = wait.until(ExpectedConditions
//				.elementToBeClickable(By.id("firstButton")));
//
//	}
//
//	/**
//	 * 
//	 * Title: testElementToBeClickableByElement
//	 * 
//	 * <p>
//	 * Description: if the button is to be clickable, return the element else
//	 * throw an exception
//	 * </p>
//	 */
//	@Test
//	public void testElementToBeClickableByElement() {
//		StartCustomPage.startNoney(driver);
//
//		WebElement element = driver.findElement(By.id("firstButton"));
//
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//
//		element = wait.until(ExpectedConditions.elementToBeClickable(element));
//
//	}
//
//	/**
//	 * 
//	 * Title: testElementToBeSelectedByElement
//	 * 
//	 * <p>
//	 * Description:
//	 * </p>
//	 * 
//	 * 
//	 */
//	@Test
//	public void testElementToBeSelectedByElement() {
//		StartCustomPage.startNoney(driver);
//
//		WebElement element = driver.findElement(By.id(""));
//
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//
//		Boolean bool = wait.until(ExpectedConditions
//				.elementToBeSelected(element));
//
//		System.err.println(bool);
//
//	}
//
//	/**
//	 * 
//	 * Title: testElementToBeSelectedBy
//	 * 
//	 * <p>
//	 * Description:
//	 * </p>
//	 * 
//	 * 
//	 */
//	@Test
//	public void testElementToBeSelectedBy() {
//		StartCustomPage.startNoney(driver);
//
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//
//		Boolean bool = wait.until(ExpectedConditions.elementToBeSelected(By
//				.id("")));
//
//		System.err.println(bool);
//
//	}
//
//	@Test
//	public void testInvisibilityOfElementLocated() {
//		StartCustomPage.startNoney(driver);
//
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//
//		Boolean bool = wait.until(ExpectedConditions
//				.invisibilityOfElementLocated(By.id("second")));
//
//		System.err.println(bool);
//
//	}
//
//	@Test
//	public void testInvisibilityOfElementWithText() {
//		StartCustomPage.startNoney(driver);
//
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//
//		Boolean bool = wait.until(ExpectedConditions
//				.invisibilityOfElementWithText(By.id("firstBox"), "first-box"));
//
//		System.err.println(bool);
//
//	}
//
//	@Test
//	public void testFindElementListByClassName() {
//		StartCustomPage.startQunar(driver);
//		BaseUtils utils = new BaseUtils();
//		List<WebElement> list = utils.getElements(driver,
//				By.className(".avt_column.avt_column_trans"));
//		System.out.println(list.size());
//	}
//
//	@Test
//	public void testFindElementListByClassNameAndClick() {
//		StartCustomPage.startQunar(driver);
//		// List<WebElement> list = BaseUtils.findElementListByClassName(driver,
//		// ".avt_column.avt_column_trans");
//		// System.out.println(list.size());
//	}
//
//	@BeforeMethod
//	public void beforeMethod() {
//		driver = new FirefoxDriver();
//	}
//
//	@AfterMethod
//	public void afterMethod() {
//		driver.quit();
//	}
//
//	@BeforeClass
//	public void beforeClass() {
//	}
//
//	@AfterClass
//	public void afterClass() {
//	}
//
//	@BeforeTest
//	public void beforeTest() {
//	}
//
//	@AfterTest
//	public void afterTest() {
//	}
//
//	@BeforeSuite
//	public void beforeSuite() {
//	}
//
//	@AfterSuite
//	public void afterSuite() {
//	}
//
//}
