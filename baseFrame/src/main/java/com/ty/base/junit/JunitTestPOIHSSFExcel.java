package com.ty.base.junit;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;

import com.ty.base.tools.POIHSSFExcel;

public class JunitTestPOIHSSFExcel {

	@Test
	public void testWriteByXSSF() throws IOException {
		String filePath = "dataSource/ooxml-newlines.xlsx";
		String sheetName = "create";
		String tableName = "sss";
		Object[][] array = { { "xxxx1", "ssss1", "dddd1" },
				{ "xxxx2", "ssss2", "dddd2" }, { "xxxx3", "ssss3", "dddd3" },
				{ "xxxx", "ssss", "dddd" } };
		POIHSSFExcel.writeByHSSF_Dom(filePath, sheetName, tableName, array, 0,
				0);
	}

	@Test
	public void testReadByHSSF_Sax() throws InvalidFormatException, IOException {
		String filePath = "dataSource/ooxml-newlines.xlsx";
		String sheetName = "create";
		POIHSSFExcel.readByHSSF_Sax(filePath,sheetName);
	}
}
