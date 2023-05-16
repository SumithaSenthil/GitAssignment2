package GitPush;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GitPushAssignment {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Cell data = null;
		File src=new File("D:\\FileInJava\\GitPush.xlsx");
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
		ArrayList tempdata=new ArrayList();
	    XSSFWorkbook xs=new XSSFWorkbook(fis);
	    XSSFSheet sht=xs.getSheetAt(0); 
	    
	    int rowcount=sht.getLastRowNum();
	    System.out.println("Total Rows "+rowcount);
	    
	    Iterator<Row> rw=sht.iterator();
	    DataFormatter dataFormatter= new DataFormatter();
	    while(rw.hasNext()) {
	    	
	    	Row row=rw.next();
	    	Iterator<Cell> cl=row.iterator();
	    
	    
	    while(cl.hasNext()) {
	    	tempdata.add(cl.next().toString());
	    	//cellValueStr = dataFormatter.formatCellValue((cl.next().toString()));
	  
	    }}
	    
	    
	    
	    	
	  	
		System.out.println(tempdata);
	    
	    xs.close();}
		
	    catch(Exception e) {
			e.printStackTrace();
		}
	

	}}