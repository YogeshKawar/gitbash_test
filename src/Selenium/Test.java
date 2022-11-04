package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static void main(String[] args) throws InterruptedException{
	//set property
	System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Downloads/chromedriver_win32/chromedriver.exe");
	//for upcasting
	WebDriver driver=new ChromeDriver();	//upcasting statement
	//open the browser
	driver.get("https://www.google.com/");
	Thread.sleep(3000);	//its java wait
	driver.manage().window().maximize();	//maximize browser
	Thread.sleep(3000);
	driver.manage().window().minimize();	//minimize browser
	Thread.sleep(3000);
	driver.close();


}
}
