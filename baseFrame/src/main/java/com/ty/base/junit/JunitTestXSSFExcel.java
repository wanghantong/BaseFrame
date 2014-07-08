package com.ty.base.junit;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import com.ty.base.tools.POIXSSFExcel;

public class JunitTestXSSFExcel {

	@Test
	public void testWriteBySXSSF() throws FileNotFoundException, IOException {
		POIXSSFExcel.writeBySXSSF("SXSSF1", null, null);
	}
}
