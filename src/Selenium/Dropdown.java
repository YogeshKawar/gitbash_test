package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users/Dell\\Documents\\Yogesh DOC\\Software Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("C:\\Users\\Dell\\Documents\\Yogesh DOC\\Software Testing\\Automation\\cars.html");
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='cars']"));
	Select s = new Select(dropdown);
	s.selectByIndex(2);
	s.selectByVisibleText("Saab");
}
}
