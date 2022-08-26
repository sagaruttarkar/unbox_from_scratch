package Find_Broken_Links;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
public static void main (String [] args) throws IOException{
File src =new File("D:\\BitBucket-jenkins2\\UNBOX_FINAL\\unbox_scratch_sagar\\src\\excel\\Unbox Social-Analytics-Facebook-FlySmart-08-11-21 12_56pm.xlsx");
FileInputStream fis = new FileInputStream(src);
XSSFWorkbook wb= new XSSFWorkbook(fis);

XSSFSheet sheet1= wb.getSheetAt(0);


int rowCount=sheet1.getLastRowNum()-sheet1.getFirstRowNum();
for(int i=0;i<=rowCount;i++){

    //get cell count in a row
    int  cellcount=sheet1.getRow(i).getLastCellNum();


    //iterate over each cell to print its value
//    System.out.println("Row"+ i+" data is :");

    for(int j=0;j<cellcount;j++){
    	DataFormatter formatter = new DataFormatter();

//        String a=sheet1.getRow(i).getCell(j).getStringCellValue();
        Cell cell = sheet1.getRow(i).getCell(j);
     String abc= formatter.formatCellValue(cell);
        System.out.println(abc);
    }

}
}


}





