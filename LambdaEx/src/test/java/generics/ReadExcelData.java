package generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	FileInputStream fis;
	Workbook workbook;
	
	public ReadExcelData(String filePath){
		
		try {
			fis=new FileInputStream(filePath);
			workbook=new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void getExcelData(Sheet sheet, Row row, Cell cell) {
		
		
	}
	//Assertions
	//group
	//parameterization

	public String[][] getExcelForDataProvider(XSSFSheet sheet) {
		
		int rowNum=sheet.getLastRowNum();
		int cellNum =sheet.getRow(rowNum).getLastCellNum();
		
		String[][] arr=new String[rowNum][cellNum];
		
		for(int i=1;i<=rowNum;i++) {
			for(int j=0;j<cellNum;j++) {
				arr[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return arr;
	}
}
