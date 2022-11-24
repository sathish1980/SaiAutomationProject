package Basicsjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	String filepath="C:\\Users\\sathishkumar\\eclipse-workspace\\Selenium6PMBatch\\input\\inputdata.xls";
	
	public void excelreadimplementation() throws IOException
	{
		File f = new File(filepath);
		FileInputStream fs = new FileInputStream(f);
		//XSSFWorkbook excel = new XSSFWorkbook(fs);
		HSSFWorkbook excel = new HSSFWorkbook(fs);
		Sheet excelsheet=excel.getSheet("input");
		int totarows=excelsheet.getPhysicalNumberOfRows();
		for (int i=0;i<totarows;i++)
		{
			Row eachrow=excelsheet.getRow(i);
			int columnvalue=eachrow.getLastCellNum();
			for(int j=0;j<columnvalue;j++)
			{
				Cell cellvaue=eachrow.getCell(j);
				System.out.print(actualdata(cellvaue));
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public Object actualdata(Cell cellvalue)
	{
		if (cellvalue.getCellType()==CellType.STRING)
		{
			return cellvalue.getStringCellValue();
		}
		else if(cellvalue.getCellType()==CellType.NUMERIC)
		{
			return cellvalue.getNumericCellValue();
		}
		return null;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelRead E = new ExcelRead();
		E.excelreadimplementation();
	}

}
