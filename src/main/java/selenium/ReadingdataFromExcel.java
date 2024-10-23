package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingdataFromExcel {

	public static void main(String[] args) throws IOException {
		
		//FileInputStream file = new FileInputStream("D:\\Eclipse\\workspace\\selenium\\testdata\\testdata.xlsx");
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\testdata.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet1");// or getSheetAt(0);
		int totalrows = sheet.getLastRowNum();
		int totalcells = sheet.getRow(1).getLastCellNum();
		
		System.out.println(totalrows);
		System.out.println(totalcells);
		
		for(int r =0;r<=totalrows;r++) {
			
			XSSFRow currentRow=sheet.getRow(r);
			
			for(int c =0;c<totalcells;c++)
			{
				XSSFCell cell = currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}
}