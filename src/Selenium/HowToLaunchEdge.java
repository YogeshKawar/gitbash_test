package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HowToLaunchEdge {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver", "C://Users//Dell//Documents//Yogesh DOC//Software Testing//Automation//edgedriver_win64//msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(3000);
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().back();	
	driver.close();
}
}
