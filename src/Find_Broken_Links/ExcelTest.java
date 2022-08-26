package Find_Broken_Links;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {


	public void Writedata(String Excelpath,String Sheetname,int row,int col,String data) throws IOException {

		try {
		File file= new File(Excelpath);
		FileInputStream fis = new FileInputStream (file);
		XSSFWorkbook wb= new XSSFWorkbook(fis);

		XSSFSheet sheet =wb.getSheet(Sheetname);

		XSSFRow Row =sheet.getRow(row);

		XSSFCell Cell= Row.getCell(col);


		if(Cell==null) {

			Row.createCell(col);
			Cell.setCellValue(data);

		}else {

			Cell.setCellValue(data);

		}


			FileOutputStream fio = new FileOutputStream(file);
			wb.write(fio);
			wb.close();

			System.out.println("write opration done!!!!!!!!!!!!!");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main (String args[]) throws IOException {


	ExcelTest Et = new ExcelTest();
	String Excelpath="D:\\BitBucket-jenkins2\\UNBOX_FINAL\\unbox_scratch_sagar\\src\\downloaded_excel_Reports\\read.xlsx";

	Et.Writedata(Excelpath, "writedata", 4, 4, "sagar.uttarkar@unboxsoccial.com");

	}
	}
