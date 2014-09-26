package com.ty.base.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.ty.base.enumeration.Department;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

	String value();

	int count();

	String annoName() default "MyAnnotation";

	Department department();


}
