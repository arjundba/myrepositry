package project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class Loginpage {
	
	@FindBy(id="email")
	private WebElement unTB;
	
	@FindBy(id="pass")
	private WebElement pwTB;
	
	@FindBy(id="loginbutton")
	private WebElement login;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void SetUsername()
	{
		unTB.sendKeys("8711013119");
	}
	
	public void Setpassword()
	{
		pwTB.sendKeys("8711013119");
	}
	
	public void Clicklogin()
	{
		login.click();
	}

	
}
