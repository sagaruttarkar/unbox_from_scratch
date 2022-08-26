package Report_Data_validation;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class pdf_validation {


@Test(priority=0,dataProvider="Filename")
public static void pdf(String file) throws IOException {
	File src =new File("src/downloaded_pdf_Reports/"+file);
	FileInputStream fis = new FileInputStream(src);
    PDFParser parser = new PDFParser(fis);
    parser.parse();

 COSDocument cos=  parser.getDocument();

PDDocument PDDoc= new PDDocument(cos);
PDFTextStripper Stripper = new PDFTextStripper();

String data= Stripper.getText(PDDoc);
System.out.println(data);

}
@DataProvider(name="Filename")


public Object[][] passdata(){

	Object[][] data= new Object[4][1];
	data[0][0]="Unbox Social-Analytics-Facebook-Ryan International Group-18-11-21 13_08pm.pdf";
	data[1][0]="Unbox Social-Analytics-Google-Disney Plus Hotstar Premium-18-11-21 13_12pm.pdf";
	data[2][0]="Unbox Social-Analytics-Instagram-Lakmé-18-11-21 13_06pm.pdf";
	data[3][0]="Unbox Social-Analytics-Twitter-Zee Music Company-18-11-21 13_10pm.pdf";
	return data;

}}
