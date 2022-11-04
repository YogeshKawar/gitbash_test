package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users/Dell\\Documents\\Yogesh DOC\\Software Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
    //css selector
    driver.findElement(By.cssSelector("input[aria-haspopup='false']")).sendKeys("Twitter");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@values='0 0 24 24']")).sendKeys(Keys.ENTER);
//   
//    driver.get("https://www.amazon.com/");
//    //use css selector(choice the mobile)
//    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mobiles under 20000");
//    //click on search button
//    driver.findElement(By.cssSelector("input[type='submit']")).click();
}
}
