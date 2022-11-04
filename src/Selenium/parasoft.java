package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class parasoft {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users/Dell\\Documents\\Yogesh DOC\\Software Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("username");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//driver.findElement(By.xpath("//a[text()='Accounts Overview']")).click();
//	WebElement p = driver.findElement(By.linkText("13677"));
//	p.click();
	driver.findElement(By.xpath("(//a[@class='ng-binding'])[1]")).click();
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='month']"));
	Select s = new Select(dropdown);
	s.selectByIndex(2);
}
}
