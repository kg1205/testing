package PageObject.Model;

import java.lang.System.Logger;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pom4 {
  @Test
  public void f() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriverr.exe");
	  WebDriver driver=new ChromeDriver();
	  pom3 p=new pom3(driver);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://www.seleniumbymahesh.com/HMS/");
	  p.setusername("admin");
	  p.setpassword("admin");
	  p.clickonsubmit();
  }
}
