package project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logintest {
	
	public static void main(String[] args)  {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		Loginpage l = new Loginpage(driver);
		l.SetUsername();
		l.Setpassword();
		l.Clicklogin();
		System.out.println("nagarjuna");
		
		driver.close();
	}
}
