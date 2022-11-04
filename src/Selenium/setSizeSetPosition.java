package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSizeSetPosition {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users/Dell\\Documents\\Yogesh DOC\\Software Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://127.0.0.1:5500/index.html");
	Thread.sleep(4000);
	Dimension dim = new Dimension(100, 200);
	driver.manage().window().setSize(dim);
	Thread.sleep(2000);
	Point p = new Point(300, 400);
	driver.manage().window().setPosition(p);
	
}
}
