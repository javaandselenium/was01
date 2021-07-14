package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {
	public FileInputStream fis;
	public static Workbook wb;
	public static Sheet sh;
	public static Row row;
	public static Cell cell;
public WebDriver driver;
public static FileOutputStream fos;

	public String readDatafromExcel() throws EncryptedDocumentException, IOException {
		fis = new FileInputStream("./data.xlsx");
		wb = WorkbookFactory.create(fis);
		sh = wb.getSheet("Sheet1");
		row = sh.getRow(1);
		cell = row.getCell(4);
		return cell.getStringCellValue();

	}
	
	public String getDataFromApplication() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		return driver.getTitle();
	}
	
	public static void writeDataToExcel(int rownum,int cellnum,String data) throws IOException  {
		row=sh.getRow(rownum);
		cell=row.getCell(cellnum);
		 cell.setCellValue(data);
		fos=new FileOutputStream("./data.xlsx");
		wb.write(fos);
	}
	
	

}
