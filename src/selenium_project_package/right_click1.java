package selenium_project_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soubh\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//create object of action class
		Actions action=new Actions(driver);
		//find element using locator and store into WebElement
		WebElement element=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		
		//perform right click operations using action(object)on element
		action.contextClick(element).perform();
		
	}

}
