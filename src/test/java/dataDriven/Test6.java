package dataDriven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Test6 extends Test5{
	@Test
	public void compareData() throws EncryptedDocumentException, IOException {
		String exceldata = readDatafromExcel();
		System.out.println(exceldata);
		String appdata = getDataFromApplication();
		System.out.println(appdata);
		writeDataToExcel(1,5,appdata);
		
		if(exceldata.equals(appdata)) {
			writeDataToExcel(1,6,"PASS");
			wb.close();
		}
		else
		{
			writeDataToExcel(1,6,"FAIL");
			wb.close();
		}
		driver.close();
	}

}
