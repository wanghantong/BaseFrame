package com.ty.base.junit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class TestJunitParameter {

	private SimpleDateFormat sdf;
	private String date;
	private String dateformat;
	private String expectedDate;
	
	
	
	public TestJunitParameter(String date, String dateformat,
			String expectedDate) {
		this.date = date;
		this.dateformat = dateformat;
		this.expectedDate = expectedDate;
	}
	
	@Parameters
	public static Collection getParamters() {

		String[][] object = {
				{ "2011-07-01 00:20:20", "yyyyMMdd", "20110701" },
				{ "2011-07-01 00:20:20", "yyyy年MM月dd日", "2011年07月01日" },
				{ "2011-07-01 00:20:20", "HH时mm分ss秒", "00时20分20秒" } };
		List<String[]> list = Arrays.asList(object);
		return  list;
	}

	@Test
	public void testJunitParameter() throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = df.parse(this.date);
		sdf = new SimpleDateFormat(this.dateformat);
		String result = sdf.format(d);
		Assert.assertEquals(this.expectedDate, result);

	}

}
