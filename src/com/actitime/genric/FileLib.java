package com.actitime.genric;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	public String getPropertyData(String key) throws IOException
	{
	FileInputStream fl= new FileInputStream("./data/common.property");
	Properties p=new Properties();
	p.load(fl);
	String data = p.getProperty(key);
	return data;
	}
	
	public String getExelData(String  sheet,int row,int cell) throws IOException
	{
	FileInputStream fl= new FileInputStream("./data/");
	Workbook wb = WorkbookFactory.create(fl);
    String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	
	return data;
	}
}