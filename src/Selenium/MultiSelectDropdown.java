package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Yogesh DOC\\Software Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("C:\\Users\\Dell\\Documents\\Yogesh DOC\\Software Testing\\Automation\\flamingo.html");
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='flamingo']"));
	Select s = new Select(dropdown);
	if(s.isMultiple()) {
		System.out.println("Is multple");
	}
		else {
			System.out.println("Is not multiple");
		}
	
	List<WebElement> allEle = s.getOptions();
	System.out.println("Size is "+allEle.size());
	
	for(int i=0;i<=allEle.size()-1;i++) {
		WebElement oneEle = allEle.get(i);
		String text = oneEle.getText();
		System.out.println(text);
		
	}
}
}
