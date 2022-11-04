package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HowToLaunchFirefox {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Documents\\Yogesh DOC\\Software Testing\\Automation\\geckodriver-v0.31.0-win64\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
	
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(3000);
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().back();	
	driver.close();
}
}
