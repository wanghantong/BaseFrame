package com.ty.base.selenium.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
	/**
	 * 数组内的每个元素都会作为一个用例数据被执行
	 * On execution testEmployeeData() will be executed 4 times, 
	 * @return
	 */
	@DataProvider(name = "DP1")
	public Object[][] createData() {
		Object[][] retObjArr = { { "001", "Jack", "London" },
				{ "002", "John", "New York" }, { "003", "Mary", "Miami" },
				{ "004", "George", "california" } };
		return (retObjArr);
	}
	
	@Test(dataProvider = "DP1")
	public void testEmployeeData(String empid, String empName, String city) {
		System.err.println(empid);
		System.err.println(empName);
		System.err.println(city);

	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {

	}
}
