package org.CAT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CatBaseClass {
	WebDriver driver ;
	
	public void ChromeOpen()
	{
		System.setProperty("webdriver.chrome.driver","C:\\javaSetup\\ChromDriver\\chromedriver.exe");
		 driver=new ChromeDriver();
   }
	public void Firefox()
	{
		System.setProperty("webdriver.gycko.driver","C:\\javaSetup\\FireFox\\geckodriver.exe");
		 driver=new FirefoxDriver();
   }
	public void Openbrowser() throws InterruptedException
	{
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
	}

	
	
}
