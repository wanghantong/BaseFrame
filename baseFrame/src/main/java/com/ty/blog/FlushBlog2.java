/**

 * 创建时间：Jul 30, 2014 9:52:57 PM

 * 项目名称：exam

 * @author T.Y

 * @version 1.0

 * @since JDK 1.7

 * 文件名称：FlushBlog.java

 * 类说明：

 */
package com.ty.blog;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ty.base.selenium.tools.MyWebDriverListener;

public class FlushBlog2 {

	private WebDriver driver;

	private static String url = "http://blog.csdn.net/wanghantong";

	static Logger logger = Logger.getLogger(FlushBlog2.class);

	MyWebDriverListener mwdl = new MyWebDriverListener();

	@Test
	public void TestIndex() throws UnsupportedEncodingException, InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();

		// first page is done
		for (int l=0;l<9999;l++) {
			loopArticle();
		}

	}

	private void loopArticle() throws InterruptedException {
		WebElement main = driver.findElement(By.id("main"));
		WebElement article_list = main.findElement(By.id("article_list"));
		List<WebElement> articles = article_list.findElements(By
				.cssSelector(".list_item.article_item"));
		System.err.println("articles.size()   :  " + articles.size());
		WebElement article;
		for (int j = 0; j < articles.size(); j++) {

			main = driver.findElement(By.id("main"));

			article_list = main.findElement(By.id("article_list"));
			articles = article_list.findElements(By
					.cssSelector(".list_item.article_item"));
			article = articles.get(j);
			WebElement pa = article.findElement(By.cssSelector(".link_title"));
			WebElement a = pa.findElement(By.tagName("a"));
			Thread.sleep(3000);
			String attribute = a.getAttribute("href");
			driver.navigate().to(attribute);
			Thread.sleep(3000);
			driver.navigate().back();
		}
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
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

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
