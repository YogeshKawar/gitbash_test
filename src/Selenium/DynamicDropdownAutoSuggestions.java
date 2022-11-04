package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownAutoSuggestions {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Yogesh DOC\\Software Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")).click();
	List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73']/div"));
	for(WebElement oneOption:allOptions) {
		String txt = oneOption.getText();
		System.out.println(txt);
		if(txt.contains("Pune")) {
			oneOption.click();
			break;
		}
	}
	driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")).click();
	List<WebElement> alloptions1 = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']/div"));
	for(WebElement oneOption1:alloptions1) {
		String txt1 = oneOption1.getText();
		System.out.println(txt1);
		if(txt1.contains("Nashik")) {
			oneOption1.click();
			break;
		}
		
	}
	//driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
	
}

}
