package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ThreadGuard;

public class dialogboxcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//chromedriver_80.exe");
driver=ThreadGuard.protect(new ChromeDriver());
driver.get("http://mail.rediff.com");
	}

}
