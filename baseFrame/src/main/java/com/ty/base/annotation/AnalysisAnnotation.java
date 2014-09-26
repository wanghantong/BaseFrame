package com.ty.base.annotation;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import org.junit.Test;

public class AnalysisAnnotation {

	public void analysis() throws Exception {
		Class clazz = Class.forName("BaseClass");

		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
			if (annotation == null) {
				continue;
			}

			BeanInfo beanInfo = Introspector.getBeanInfo(annotation.getClass(),
					Object.class);

			MethodDescriptor[] methodDescriptors = beanInfo
					.getMethodDescriptors();

			for (MethodDescriptor md : methodDescriptors) {
			}
		}
	}

	@Test
	public void testAnno() throws Exception {
		Class clazz = Class.forName("com.ty.base.annotation.BaseClass");
		Class annoClazz = Class.forName("com.ty.base.annotation.MyAnnotation");

		Method[] annoMethods = annoClazz.getDeclaredMethods();
		for (Method annoMethod : annoMethods) {
			// System.err.println("annoMethods  :  " + annoMethod.getName());
		}

		Method[] methods = clazz.getDeclaredMethods();
		int i = 0;
		for (Method method : methods) {
			System.out.println("times   ....   " + i++);
			String methodName = method.getName();

			MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
			System.err.println("annotation   :  " + annotation);
			if (annotation == null) {
				System.err.println("methodName  : " + methodName+ "   no  annotation.....");
				continue;
			}
			getProperties(annotation);
			// BeanInfo beanInfo =
			// Introspector.getBeanInfo(annotation.getClass());
			//
			// PropertyDescriptor[] propertyDescriptors = beanInfo
			// .getPropertyDescriptors();
			//
			// for (PropertyDescriptor propertyDescriptor : propertyDescriptors)
			// {
			// String displayName = propertyDescriptor.getDisplayName();
			// String name = propertyDescriptor.getName();
			// Class<?> type = propertyDescriptor.getPropertyType();
			// System.err.println("displayName  :  " + displayName
			// + "  name  :  " + name + "   type :  " + type);
			// }
			//
			// MethodDescriptor[] methodDescriptors = beanInfo
			// .getMethodDescriptors();
			//
			// System.out.println("methodDescriptors.size   :"
			// + methodDescriptors.length);
			// for (MethodDescriptor md : methodDescriptors) {
			// String displayName = md.getDisplayName();
			// String name = md.getName();
			// System.out.println("method displayName : " + displayName
			// + "   method name " + name);
			// }
		}
	}

	public <T> void getProperties(T t) throws Exception {

		Method[] annoMethods = t.getClass().getDeclaredMethods();

		for (Method method : annoMethods) {
			String methodName = method.getName();
			try {
				PropertyDescriptor pd = new PropertyDescriptor(methodName,
						BaseClass.class);
				String displayName = pd.getDisplayName();
				String name = pd.getName();
				Class<?> type = pd.getPropertyType();
				System.err.println("----displayName  : " + displayName
						+ "  +name  :" + name + "   type : " + type);

				Object invoke = method.invoke(t, null);
				System.err.println("invoke   : " + invoke);

			} catch (Exception e) {
				continue;
			}

			MethodDescriptor md = new MethodDescriptor(method);
			String displayName = md.getDisplayName();
			String name = md.getName();
			System.out.println("method displayName : " + displayName
					+ "   method name " + name);
			BaseClass.class.newInstance().testAnnotation();

			// Object invoke = method.invoke(t, null);
			// System.err.println("getProperties    " + methodName
			// + "    invoke   :  " + invoke);

		}
	}

	public void test() throws Exception {

	}
}