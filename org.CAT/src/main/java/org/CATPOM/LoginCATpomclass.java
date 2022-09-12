package org.CATPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginCATpomclass {
	@FindBy(xpath="//input[@class='inputtext _55r1 _6luy']") private WebElement username;
	
	@FindBy(xpath="//input[@class='inputtext _55r1 _6luy _9npi']")private WebElement passward;
	
	@FindBy(xpath="//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")private WebElement login;
	
	public void username1(String x)
	{
		username.sendKeys(x);
	}

	public void passward1(String y)
	{
	    passward.sendKeys(y);
	}


	public void Login1()
	{
		login.click();
		
	}

 public LoginCATpomclass(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


}
