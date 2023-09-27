package selenium_project_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_down {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soubh\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		//for scroll down
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");
		
		//scroll the page till the element is found
		
		//WebElement Element=driver.findElement(By.linkText("Linux"));
		//js.executeScript("arguments[0].scrollIntoView();",Element);
		
		//horizontal
		
		//WebElement Element=driver.findElement(By.linkText("VBScript"));
		//js.executeScript("arguments[0].scrollIntoView();",Element);

		//bottom of the page
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}
