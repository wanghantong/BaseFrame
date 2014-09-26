/**

 * 创建时间：Apr 25, 2014 3:54:19 PM

 * 项目名称：exam

 * @author T.Y

 * @version 1.0

 * @since JDK 1.7

 * 文件名称：TestDateFormat.java

 * 类说明：

 */
package com.ty.base.tools;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.rmi.CORBA.Tie;

import org.junit.Test;

public class TestDateFormat {
	@Test
	public void testDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = new Date();
		String format = sdf.format(d);
		System.err.println(format);
		
		long timeMillis = System.currentTimeMillis();
		timeMillis = timeMillis+24*60*60*1000*7;
		d = new Date(timeMillis);
		format = sdf.format(d);
		System.err.println(format);
	}
	@Test
	public void testCalender() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(calendar.DAY_OF_MONTH, 7);
		System.err.println(calendar.getTime());
	}
}
