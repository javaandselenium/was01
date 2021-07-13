package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Test3 {
@Test
public void tc1() throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("Sheet1");
	Row row = sh.getRow(3);
	short cellnum = row.getLastCellNum();
	for(int i=0;i<cellnum;i++) {
		System.out.println(row.getCell(i).getStringCellValue());
	}
	
}
}