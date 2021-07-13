package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Test4 {
	@Test
	public void tc1() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rownumb = sh.getLastRowNum();
		
		for(int i=1;i<rownumb;i++) {
			Row row = sh.getRow(i);
			String rowData = row.getCell(0).getStringCellValue();
			if(rowData.equals("2"))
			{
				short cellnum = row.getLastCellNum();
				for(int j=0;j<cellnum;j++) {
					String data = row.getCell(j).getStringCellValue();
					System.out.println(data);
				
				}
				break;
			}
			
			else
			{
				System.out.println("data not found");
			}
		}
		
	}}

