package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//for upcasting
		WebDriver driver=new ChromeDriver();	//upcasting statement
		//open the browser
		driver.get("https://www.google.com/");
	}

}
