package com.ty.base.annotation;

import com.ty.base.enumeration.Department;
/**
 * 
 * <p>Title: BaseClass</p>

 * <p>Description: 使用了自定义注解的类</p>

 * <p>Company: </p> 

 * @author : Dragon

 * @date : 2014年10月9日
 */
public class BaseClass {
	
	private int count;

	@MyAnnotation(count = 10, department = Department.develop, value = "xxx")
	public void testAnnotation() {
		System.err.println("=========");
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

}
