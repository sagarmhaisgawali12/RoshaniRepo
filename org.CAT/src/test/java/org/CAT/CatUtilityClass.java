package org.CAT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;


public class CatUtilityClass extends CatBaseClass {
	
	public  void Screenshot(WebDriver driver) throws IOException
    {
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
		LocalDateTime now=LocalDateTime.now();
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest=new File("D:\\Takesscreenshot\\"+dt.format(now)+".jpg");
		FileUtils.copyFile(Source,Dest);
		
	}
	public void Screenshot2(WebDriver driver ,String Failed)
	{
		try 
		{
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File Dest=new File("D:\\Takesscreenshot\\"+Failed+".jpg");
			FileUtils.copyFile(source,Dest);
		}
		catch(Exception e)
		{
			System.out.println(" Exception while taking the screenshot"+e.getMessage());
			
		}
	}
	
	
	
	public static String getdata(int row,int col) throws EncryptedDocumentException, IOException
	{
		String path="C:\\Users\\DELL\\Documents\\ExcelParameterization.xlsx";
		FileInputStream file=new FileInputStream(path);
		String data=WorkbookFactory.create(file).getSheet("Sheet2").getRow(row).getCell(col).getStringCellValue();
		return data;
		
	}
	public  void assertion() 
	{
		SoftAssert  a=new SoftAssert();
		String expected = driver.getCurrentUrl();
		String actual="www.facebook.com";
		a.assertEquals(actual, expected);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
