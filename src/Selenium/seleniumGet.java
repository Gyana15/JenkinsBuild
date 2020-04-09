package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//chromedriver_80.exe");
		 ChromeOptions chromeOptions = new ChromeOptions();
	        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	        WebDriver driver = new ChromeDriver(chromeOptions);
		/*driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);*/
		System.out.println("Opening Facebook");
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		System.out.println("Opening twitter");
		driver.get("http://www.twitter.com");
		System.out.println(driver.getTitle());
		System.out.println("Opening gmail");
		driver.navigate().to("http://www.gmail.com");
		System.out.println(driver.getTitle());
		System.out.println("Opening navigate back");
		driver.navigate().back();
		System.out.println(driver.getTitle());
		System.out.println("Opening navigating forward");
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		System.out.println("Opening refresh");
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		
		//Select sort
		Select s= new Select (driver.findElement(By.xpath("")));
		List<String> listElements = new ArrayList<String> ();
		List<WebElement> l = s.getOptions();
		for(WebElement e : l)
			listElements.add(e.getText());
		driver.switchTo().frame(0);
		driver.close();
	}

}
