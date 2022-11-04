package Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users/Dell\\Documents\\Yogesh DOC\\Software Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
//		driver.findElement(By.cssSelector("button[aria-label='No thanks']")).click();
//		driver.findElement(By.cssSelector("input[spellcheck='false']")).sendKeys("frequently ask question of java");
		String expcT = "Google";
		Thread.sleep(2000);
		String actT = driver.getTitle();
		if(expcT.equals(actT)) {
			System.out.println("Test case is passed");
		}
		else {
			System.out.println("Test Case is failed");
		}
	}
}
