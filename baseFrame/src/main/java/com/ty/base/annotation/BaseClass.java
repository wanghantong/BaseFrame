package com.ty.base.annotation;

import com.ty.base.enumeration.Department;

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
