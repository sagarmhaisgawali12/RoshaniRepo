package org.CATPOM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImplimentationClassFacebook implements InterfaceFacebook {
	
	@FindBy(xpath=("(//input[@dir=\"ltr\"])[1]")) private WebElement  Searchbutton;
	@FindBy(xpath="(//div[@class='rq0escxv l9j0dhe7 du4w35lb j83agx80 rj1gh0hx buofh1pr g5gj957u hpfvmrgz "
			+ "i1fnvgqd bp9cbjyn owycx6da btwxx1t3 b5q2rw42 lq239pai mysgfdmx hddg9phg'])[3]")
	private WebElement SearchClick;
	

	public void serachfriend()
	{
		Searchbutton.sendKeys(Keys.ENTER);
		Searchbutton.sendKeys("Tusar patil");
		SearchClick.click();
	}
 
	public void sendFriendrequest() {
		// TODO Auto-generated method stub
		
	}
	public void textmassege() {
		// TODO Auto-generated method stub
		
	}
	
	 public ImplimentationClassFacebook(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

}
