package PageObject.Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pom2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriverr.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/HMS/");

		Pom p = new Pom();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.seleniumbymahesh.com/HMS/");
		Thread.sleep(2000);

		p.setusername("admin");
		p.setpassword("admin");
		p.submitlink();
		p.regiserlink();

	}
}
