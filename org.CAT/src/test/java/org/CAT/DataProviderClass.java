package org.CAT;

import org.testng.annotations.Test;

import java.io.IOException;

import org.CATPOM.LoginCATpomclass;
import org.CATPOM.LogoutCATpomclass;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
public class DataProviderClass extends CatUtilityClass {
	LoginCATpomclass obj;
	LogoutCATpomclass obj3 ;
	@BeforeTest
	@Parameters("Browser")
	public void setproperty(String x)
	{
		if(x.equalsIgnoreCase("Chrome"))
		{
			ChromeOpen();
		}
	}
	
	@BeforeMethod()
	public void BeforeMethod() throws InterruptedException 
	{
		//login
		Openbrowser();
		Thread.sleep(1500);
   
	}
	@Test(dataProvider="testdata")
	public void Testdata (String Username ,String  passward) throws InterruptedException, IOException
	{
		 obj=new LoginCATpomclass(driver);
			obj.username1(Username);
			Thread.sleep(2000);
			obj.passward1(passward);
			Thread.sleep(2000);
			obj.Login1();
			Thread.sleep(2000);
			Screenshot(driver);
			Thread.sleep(2000);
				
		
	}
	
	
/*	public String DataProvider() throws InterruptedException, EncryptedDocumentException, IOException
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=0;j<=1;j++)
			{
		String  data= getdata(i, j);
		return data;
			}
		}
		return null;
		*/
		
		
	/*	Object[][] data=new Object[2][2];
		data[0][0]= "7066339405";
		data[0][1]= "sagar#sagar";
		Thread.sleep(3000);
		data[1][0]= "Fazila";
		data[1][1]= "sagar#sagar";
		return data;
		*/
	
	
	@AfterMethod
	public void aftermethod() throws InterruptedException
	{
		//logout
		 System.out.println("AfterMethod");
		 obj3=new LogoutCATpomclass (driver);
		 obj3.logAction1();
		 Thread.sleep(1000);
		 obj3.Finallogout();
		 Thread.sleep(5000);
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("Afterclass");
		obj=null;
		obj3=null;
		
	}
	@AfterTest
	public void AfterTest() throws Throwable
	{
		System.out.println("AfterTest");
		driver.close();
		finalize();
		System.gc();
	}
	@DataProvider(name="testdata")
	public Object[][] dataProvider() throws EncryptedDocumentException, IOException
	{
		Object[][] data= {{getdata(1, 0),getdata(1, 1)},{getdata(2, 0),getdata(2, 1)}};
		return data;
		/*Object[][] data=new Object[2][2];
		data[0][1]= "supriya";
		data[1][1]= "supriya123";
		return data;
		*/
	}
	
	
	
	
	
	
	
	
	
}
