package selenium;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataInSpecificRowAndCell {

	public static void main(String[] args) throws IOException {
FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile_random.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("DynamicData");
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows:");
		int rows = sc.nextInt();
		System.out.println("enter the cells:");
		int cells = sc.nextInt();
		*/
		
		XSSFRow row = sheet.createRow(3);
		XSSFCell cell = row.createCell(2);
		
		cell.setCellValue("WELCOME");
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File is created");

	}

}
