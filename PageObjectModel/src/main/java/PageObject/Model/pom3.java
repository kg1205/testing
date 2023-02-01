package PageObject.Model;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom3 {
	WebDriver driver;
	By username=By.name("username");
	By password=By.name("password");
	By submit=By.name("submit");
	pom3(WebDriver d){
		driver=d;
	}
	
	public void setusername(String uname) {
		driver.findElement(username).sendKeys(uname);
		
	}
	public void setpassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void clickonsubmit() {
		driver.findElement(submit).click();
	}
}
