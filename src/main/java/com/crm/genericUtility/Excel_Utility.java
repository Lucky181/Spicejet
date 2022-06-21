package com.crm.genericUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	public static Workbook wb;
	public static void openExcel(String path) throws Throwable {
		FileInputStream fis=new FileInputStream(path);
		wb=WorkbookFactory.create(fis);	
	}

	public static Object[][] collectingDataFromExcel(String sheetname) {
		
		Sheet sh=wb.getSheet(sheetname);
		Object[][] arr= new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
		
		for(int i=0;i<sh.getLastRowNum();i++) {
			for(int j=0;j<sh.getRow(j).getLastCellNum();j++) {
				arr[i][j]=sh.getRow(i+1).getCell(j).toString();
			}
		}
		return arr;
		
		
	}





}
