package org.CAT;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.CATPOM.LoginCATpomclass;
import org.CATPOM.LogoutCATpomclass;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
public class CATtest extends CatUtilityClass {
	LoginCATpomclass obj;
	LogoutCATpomclass obj3;
	
	
	@BeforeTest
	@Parameters("Browser")
	public void setproperty(String x)
	{
		if(x.equalsIgnoreCase("Chrome"))
		{
			ChromeOpen();
		}
	/*	else if(x.equalsIgnoreCase("FireFox"))
		{
			Firefox();
		}
		*/
	}
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		Openbrowser();
		
		Thread.sleep(1500);
	}
	@BeforeMethod()
	public void BeforeMethod() throws InterruptedException, EncryptedDocumentException, IOException
	{
		//login
    obj=new LoginCATpomclass(driver);
	obj.username1(getdata(1,0));
	Thread.sleep(2000);
	obj.passward1(getdata(1,1));
	Thread.sleep(2000);
	obj.Login1();
	Thread.sleep(2000);
		
	}
	@Test(priority=1)
	public void Varification() throws IOException, InterruptedException
	{
		//varification
		String Title = driver.getTitle();
		System.out.println(Title);
		
		//Thread.sleep(2000);
		Screenshot(driver);
		
		
	}
	@Test(priority=2)
	public void facebookLogo()
	{
	 obj3.isDisplayed();
	}
	/*@Test(priority=3)
	public void Assertion1()
	{
		assertion();
		System.out.println("Assertion is pass");
	}
	*/
	@AfterMethod
	public void afterMEthod(ITestResult result) throws InterruptedException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Screenshot2(driver,result.getName());
		}
		
		
			//logout
			 System.out.println("AfterMethod");
			 obj3=new LogoutCATpomclass (driver);
			 obj3.logAction1();
			 Thread.sleep(1000);
			 obj3.Finallogout();
			 Thread.sleep(1000);
		
		
		
		
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
	
	
	
	
	
	
	

}
