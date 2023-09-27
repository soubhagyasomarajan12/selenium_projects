package selenium_project_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soubh\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//launch the application under test(AUT)
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
		
//right click the button to launch right click menu options
Actions ac=new Actions(driver);
WebElement link=driver.findElement(By.cssSelector("#authentication > button"));
	ac.doubleClick(link).perform();
	//click on edit link on the displayed menu options
	WebElement element=driver.findElement(By.cssSelector(""));
	element.click();
	///driver.quit();
	}
}
