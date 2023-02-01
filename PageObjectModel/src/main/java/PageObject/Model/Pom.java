package PageObject.Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {

	WebDriver driver;
	
	@FindBy(name="username") WebElement usern;
	@FindBy(name="username") WebElement passw;
	@FindBy(name="submit") WebElement login;
	@FindBy(linkText = "Registration") WebElement register;
	@FindBy(name = "PATIENT_CAT") WebElement catagiry;
	@FindBy(name = "TITLE") WebElement title;
	
	
	public void pom(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void setusername(String uname) {
		usern.sendKeys(uname);
	}
	public void setpassword(String pass) {
		passw.sendKeys(pass);
	}
	public void submitlink() {
		login.click();
	}
	public void regiserlink() {
		register.click();
	}
}
