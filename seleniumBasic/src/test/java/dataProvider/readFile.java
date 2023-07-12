package dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readFile{
    public static int rowCount;
    public static int cellCount;
    
	
	@SuppressWarnings("resource")
	public void readExcel(String excelPath, String sheetName)
	{
		try {
			FileInputStream file = new FileInputStream(excelPath);
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			//XSSFSheet sheet = workbook.getSheetAt(0);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			rowCount = sheet.getLastRowNum();
			cellCount = sheet.getRow(0).getLastCellNum();
			 
			 for(int i =0; i <=rowCount; i++)
			 {
				XSSFRow row = sheet.getRow(i); 
				for(int j =0; j<cellCount; j++ )
				{
					String readData = row.getCell(j).toString();
					System.out.println(readData);	
				}
			 }
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		readFile r = new readFile();
		r.readExcel("C:\\Users\\arvin\\eclipse-workspace\\seleniumBasic\\src\\test\\resources\\TestData.xlsx", "Sheet1");

	}

	public void read() {
		// TODO Auto-generated method stub
		
	}

	

}
