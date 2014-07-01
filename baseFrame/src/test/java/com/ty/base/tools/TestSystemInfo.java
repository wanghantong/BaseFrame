package com.ty.base.tools;

import org.junit.Test;

public class TestSystemInfo {

	SystemInfo si = new SystemInfo();

	@Test
	public void testGetOSName() {
		String osName = si.getOSName();
		System.out.println("osName  : " + osName);
	}

	@Test
	public void testGetOSVersion() {
		String osVersion = si.getOSVersion();
		System.out.println("osVersion  : " + osVersion);
	}

	@Test
	public void testGetOSUserName() {
		String osUserName = si.getOSUserName();
		System.out.println("osUserName  : " + osUserName);
	}

	@Test
	public void testGetOSUserHome() {
		String osUserHome = si.getOSUserHome();
		System.out.println("osUserHome  : " + osUserHome);
	}

	@Test
	public void testGetOSUserDir() {
		String osUserDir = si.getOSUserDir();
		System.out.println("osUserDir  : " + osUserDir);
	}

	@Test
	public void testGetJavaTempDir() {
		String javaTempDir = si.getJavaTempDir();
		System.out.println("javaTempDir  : " + javaTempDir);
	}

	@Test
	public void testGetJavaClassPath() {
		String javaClassPath = si.getJavaClassPath();
		System.out.println("javaClassPath  : " + javaClassPath);
	}

	public void testGetJavaVMName() {
		String javaVMName = si.getJavaVMName();
		System.out.println("javaVMName  : " + javaVMName);
	}

	@Test
	public void testGetJavaHome() {
		String javaHome = si.getJavaHome();
		System.out.println("javaHome  : " + javaHome);
	}

	@Test
	public void testGetJavaVersion() {
		String javaVersion = si.getJavaVersion();
		System.out.println("javaVersion  : " + javaVersion);
	}

	@Test
	public void testGetJavaVendor() {
		String javaVendor = si.getJavaVendor();
		System.out.println("javaVendor  : " + javaVendor);
	}

	@Test
	public void testGetJavaVendorUrl() {
		String javaVendorUrl = si.getJavaVendorUrl();
		System.out.println("javaVendorUrl  : " + javaVendorUrl);
	}

}
