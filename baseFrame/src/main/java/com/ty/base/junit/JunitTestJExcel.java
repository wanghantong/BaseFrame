package com.ty.base.junit;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * http://jexcelapi.sourceforge.net/
 * 使用jexcelapi进行excel数据源的测试
 * @author hanyang
 * TestNG
 */
public class JunitTestJExcel {

	@Test(dataProvider = "data1")
	public void testEmployeeData(String empid, String empName, String city) {
		System.out.println(empid + "    " + empName + "    " + city);
	}

	@DataProvider(name = "data1")
	public String[][] dataProvider() throws BiffException, IOException {
		String xlFilePath = "dataSource/ExcelTemp.xls";
		String sheetName = "test1";
		String tableName = "start";
		return JunitTestJExcel.getTableArray(xlFilePath, sheetName, tableName);

	}

	private static String[][] getTableArray(String xlFilePath, String sheetName,
			String tableName) throws BiffException, IOException {

		Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
		Sheet sheet = workbook.getSheet(sheetName);
		int startRow, startCol, endRow, endCol, ci, cj;
		Cell tableStart = sheet.findCell(tableName);
		startRow = tableStart.getRow();
		startCol = tableStart.getColumn();

		Cell tableEnd = sheet.findCell(tableName, startCol + 1, startRow + 1,
				100, 64000, false);

		endRow = tableEnd.getRow();
		endCol = tableEnd.getColumn();

		String[][] tabArray = new String[endRow - startRow][endCol - startCol
				- 1];
		ci = 0;
		for (int i = startRow + 1; i <= endRow; i++, ci++) {
			cj = 0;
			for (int j = startCol + 1; j < endCol; j++, cj++) {
				tabArray[ci][cj] = sheet.getCell(j, i).getContents();
			}
		}
		return tabArray;
	}

}// end of class
