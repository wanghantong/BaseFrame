package com.ty.base.tools;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {

	/**
	 * change date type from Date to String
	 * 
	 * @param date
	 * @param format
	 *            yyyy-MM-dd
	 */
	public String dateChange(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		format = sdf.format(date);
		return format;
	}

	/**
	 * calculate date the result is now add some days
	 * 
	 * @param days
	 * @return Date
	 */
	public Date addDays(int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, days);
		return calendar.getTime();
	}

	/**
	 * calculate date the result is now add some seconds
	 * 
	 * @param seconds
	 * @return
	 */
	public Date addSeconds(int seconds) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.SECOND, seconds);
		return calendar.getTime();
	}

}
