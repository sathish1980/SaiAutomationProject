package Basicsjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ExcelWrite {
String filepath="C:\\Users\\sathishkumar\\eclipse-workspace\\Selenium6PMBatch\\output\\outpudata.xls";
	String[] name= {"sathish","kumar","R"};
	public void excelwriteimplementation() throws IOException
	{
		File f = new File(filepath);
		FileOutputStream fs = new FileOutputStream(f);
		//XSSFWorkbook excel = new XSSFWorkbook(fs);
		HSSFWorkbook excel = new HSSFWorkbook();
		Sheet excelsheet=excel.createSheet("output");
		//int totarows=excelsheet.getPhysicalNumberOfRows();
		int totalrows=name.length;
		for (int i=0;i<totalrows;i++)
		{
			Row eachrow=excelsheet.createRow(i);
			int columnvalue=name.length;
			//int columnvalue=eachrow;
			//for(int j=0;j<columnvalue;j++)
			//{
				Cell cellvaue=eachrow.createCell(0);
				cellvaue.setCellValue(name[i]);
				//System.out.print(" ");
			//}
		}
			System.out.println("done");
			excel.write(fs);
			fs.close();
			excel.close();
		//}
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelWrite E = new ExcelWrite();
		E.excelwriteimplementation();
	}

}
