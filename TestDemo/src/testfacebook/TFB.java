package testfacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TFB {

	public static void main(String[] args) {
		
        System.setProperty("Webdriver.chrome.driver","‪‪C:\\chromedriver.exe");

      WebDriver driver = new ChromeDriver();
      driver.navigate().to("http://facebook.com");
	}

}
