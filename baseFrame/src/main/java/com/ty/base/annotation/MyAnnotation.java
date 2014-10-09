package com.ty.base.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.ty.base.enumeration.Department;
/**
 * 
 * <p>Title: MyAnnotation</p>

 * <p>Description: 自定义注解类，</p>

 * <p>Company: </p> 

 * @author : Dragon

 * @date : 2014年10月9日
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

	String value();

	int count();

	String annoName() default "MyAnnotation";

	Department department();


}
