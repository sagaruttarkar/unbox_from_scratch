package Report_Data_validation;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel_validation {

@Test(priority=0,dataProvider="Filename")
public  void Excel_opration (String file) throws IOException{
//String Filename="Unbox Social-Analytics-Facebook-FlySmart-08-11-21 12_56pm.xlsx";




File src =new File("src/downloaded_excel_Reports/"+file);
FileInputStream fis = new FileInputStream(src);
XSSFWorkbook wb= new XSSFWorkbook(fis);

System.out.println(file);
int a= wb.getNumberOfSheets();
System.out.println("***************sheet count is**************** ="+a);

for(int j=0;j<a;j++) {

System.out.println("***************sheet name is**************** ="+ wb.getSheetName(j));
	XSSFSheet sheet1= wb.getSheetAt(j);
	DataFormatter formatter = new DataFormatter();

	int rowCount=sheet1.getLastRowNum()-sheet1.getFirstRowNum();
	for(int i=0;i<=rowCount;i++){


	    int  cellcount=sheet1.getRow(i).getLastCellNum();





	    for(int k=0;k<cellcount;k++){

	        Cell cell = sheet1.getRow(i).getCell(k);
	     String abc= formatter.formatCellValue(cell);
	        System.out.println(abc);
	        fis.close();
	        wb.close();


	    }
	}}}
	    @DataProvider(name="Filename")


	    	public Object[][] passdata(){

	    		Object[][] data= new Object[7][1];
	    		data[0][0]="Unbox Social-Analytics-Facebook-Ryan International Group-03-01-22 12_18pm.xlsx";
	    		data[1][0]="Unbox Social-Analytics-Google-Disney Plus Hotstar Premium-03-01-22 12_30pm.xlsx";
	    		data[2][0]="Unbox Social-Analytics-Instagram-NBA India-03-01-22 12_12pm.xlsx";
	    		data[3][0]="Unbox Social-Analytics-Twitter-Zee Music Company-03-01-22 12_24pm.xlsx";

	    		data[4][0]="Unbox Social-Competition-Facebook-Trisvaraas (27) (1).xlsx";
	    		data[5][0]="Unbox Social-Competition-Twitter-TWC3 (27).xlsx";
	    		data[6][0]="Unbox Social-Competition-Youtube-YT Imp1 (25) (1).xlsx";

	    		return data;

}}







