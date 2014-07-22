package com.ty.base.path;

import java.net.URL;

public class ClassLoaderUtils {
	/**
	 * 
	 * @return 当前类class文件的URI目录。不包括自己！
	 */
	public URL getClassURI() {
		return this.getClass().getResource("");
	}

	/**
	 * @return 当前的classpath的绝对URI路径
	 */
	public URL getAbsoluteClassURI() {
		return this.getClass().getResource("/");
	}

	/**
	 * @return 当前的classpath的绝对URI路径
	 */
	public URL getAbsoluteClassURIByClassLoader() {
		return this.getClass().getClassLoader().getResource("");
	}

	/**
	 * @return 当前的classpath的绝对URI路径
	 */
	public URL getAbsoluteClassURIBySystemResource() {
		return ClassLoader.getSystemResource("");
	}

	/**
	 * @return 当前的classpath的绝对URI路径
	 */
	public URL getAbsoluteClassURIByThread() {
		return Thread.currentThread().getContextClassLoader().getResource("");
	}

	public void getWebRootPath() {
		// return ServletActionContext.getServletContext().getRealPath("/");
	}

}
