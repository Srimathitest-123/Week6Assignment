package week7.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelAssignment {
	
	public static String[][] readexcel(String Excelfile)  throws IOException
	{
		XSSFWorkbook wBook=new XSSFWorkbook("./Data/"+Excelfile+".xlsx");
		
		//specific sheet
		XSSFSheet sheet = wBook.getSheetAt(0);
				
		//get the row count
		int rowcount=sheet.getLastRowNum();
		System.out.println(rowcount);
		
		//get the column count
		int colcount=sheet.getRow(0).getLastCellNum();
		System.out.println(colcount);
		String[][] data=new String[rowcount][colcount];
		
		for(int i=1;i<=rowcount;i++)
		{
			
			XSSFRow rowfor=sheet.getRow(i);
		
				for(int j=0;j<colcount;j++)
				{
					
					String Excelvalue = rowfor.getCell(j).getStringCellValue();
					System.out.println("Excel vlaue "+ Excelvalue);
					data[i-1][j]=Excelvalue;//data[1-1][1]="Testleaf";
					
				}			
			
		}
		wBook.close();
		return data;
	}


}
