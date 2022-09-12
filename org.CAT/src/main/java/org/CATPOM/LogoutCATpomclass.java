package org.CATPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutCATpomclass {

	
		
		@FindBy(xpath=("(//div[@class='q9uorilb l9j0dhe7 pzggbiyp du4w35lb'])[1]")) private WebElement log ;
		public void logAction1()
		{
			log.click();
		}
		@FindBy(xpath=("(//div[contains(@class,'qzhwtbm')])[5]")) private WebElement log2 ;
	//	(//div[@class='j83agx80 cbu4d94t ew0dbk1b irj2b8pg'])[5]
	//	(//div[contains(@class,'qzhwtb')])[33]
		
		
		//(//div[contains(@class,'qzhwtbm')])[5]
		public void Finallogout()
		{
			log2.click();
		}
		
		
		@FindBy(xpath="(//div[contains(@class,'ehxjyohh kr520xx4 ')])[1]") private WebElement logo;
		public void isDisplayed()
		{
			boolean a=logo.isDisplayed();
			if(a==true)
			{
				System.out.println("Facebbok  logo is displayed successfully");
			}
		}
		
		
		public LogoutCATpomclass(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
	

}
