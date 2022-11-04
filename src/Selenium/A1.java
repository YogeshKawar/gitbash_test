package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users/Dell\\Documents\\Yogesh DOC\\Software Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(4000);
	driver.manage().window().maximize();
	Thread.sleep(4000);
	//String url="https://www.google.com/";
	//driver.get(url);
	driver.manage().window().minimize();
	Thread.sleep(4000);
	driver.close();
}
}

